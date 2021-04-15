package by.htp.excustomer.logic;

import java.util.ArrayList;

import by.htp.excustomer.entity.Customer;

//int id, String lastName, String firstName, String midleName, String address, int creditCardNumber, int bankAccountNumber
public class CustomerLogic {

	public Customer createCustomer(int id, String lastName, String firstName, String address, int creditCardNumber,
			int bankAccountNumber) {

		if (address == null || lastName == null || firstName == null) {
			throw new IllegalArgumentException("createCustomer: ФИО или адрес не должен быть null");
		}

		if (id <= 0 || creditCardNumber <= 0 || bankAccountNumber <= 0) {
			throw new IllegalArgumentException("createCustomer: значение int не должен быть <= 0");
		}

		return new Customer(id, lastName, firstName, address, creditCardNumber, bankAccountNumber);
	}

	public Customer createCustomer(int id, String lastName, String firstName, String midleName, String address,
			int creditCardNumber, int bankAccountNumber) {

		if (address == null || lastName == null || firstName == null || midleName == null) {
			throw new IllegalArgumentException("createCustomer: ФИО или адрес не должен быть null");
		}

		if (id <= 0 || creditCardNumber <= 0 || bankAccountNumber <= 0) {
			throw new IllegalArgumentException("createCustomer: значение int не должен быть <= 0");
		}

		return new Customer(id, lastName, firstName, midleName, address, creditCardNumber, bankAccountNumber);
	}

	public void sortCustomer(ArrayList<Customer> customers) {

		sortCustomer(customers, true);

	}

	public void sortCustomerReverse(ArrayList<Customer> customers) {

		sortCustomer(customers, false);

	}

	private void sortCustomer(ArrayList<Customer> customers, boolean sortOrder) {

		for (int i = 0; i < customers.size(); i++) {
			Customer tempCustomer = customers.get(i);
			int tempIndex = i;

			for (int j = i; j < customers.size(); j++) {

				int compare = tempCustomer.getLastName().compareTo(customers.get(j).getLastName());

				if (compare == 0) {
					compare = tempCustomer.getMidleName().compareTo(customers.get(j).getMidleName());

					if (compare == 0) {
						compare = tempCustomer.getFirstName().compareTo(customers.get(j).getFirstName());
					}
				}

				if ((sortOrder && compare > 0) || (!sortOrder && compare < 0)) {
					tempCustomer = customers.get(j);
					tempIndex = j;
				}

			}

			customers.set(tempIndex, customers.get(i));
			customers.set(i, tempCustomer);

		}

	}

	public void showRangeCardNumber(ArrayList<Customer> customers, int min, int max) {

		if (min <= max) {
			for (int i = 0; i < customers.size(); i++) {
				if (customers.get(i).getCreditCardNumber() >= min && customers.get(i).getCreditCardNumber() <= max) {
					System.out.println(customers.get(i).toString());
				}
			}
		} else {
			System.out.println("Wrong credentials: min-" + min + " > max-" + max);
		}

	}

}
