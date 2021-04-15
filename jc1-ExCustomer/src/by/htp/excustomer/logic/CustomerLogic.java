package by.htp.excustomer.logic;

import java.util.ArrayList;
import java.util.Random;

import by.htp.excustomer.entity.Customer;

//int id, String lastName, String firstName, String midleName, String address, int creditCardNumber, int bankAccountNumber
public class CustomerLogic {

	public ArrayList<Customer> genCustomer(int size) {
		if (size <= 0) {
			size = 10;
		}

		ArrayList<Customer> customers = new ArrayList<Customer>(size);

		for (int i = 0; i < size; i++) {
			customers.add(genCustomer());
		}

		return customers;
	}

	private Customer genCustomer() {
		int id = (int) (Math.random() * 100 + 1);
		String lastName = genString((int) (Math.random() * 10 + 1));
		String firstName = genString((int) (Math.random() * 10 + 1));
		String midleName = genString((int) (Math.random() * 10 + 1));
		String address = "st." + genString((int) (Math.random() * 10 + 1)) + "," + (int) (Math.random() * 100 + 1);
		int creditCardNumber = (int) (Math.random() * 1000 + 1000);
		int bankAccountNumber = (int) (Math.random() * 10000 + 10000);

		if (((int) (Math.random() * 10 + 1)) % 2 == 0) {
			return new Customer(id, lastName, firstName, midleName, address, creditCardNumber, bankAccountNumber);
		} else {
			return new Customer(id, lastName, firstName, address, creditCardNumber, bankAccountNumber);
		}

	}

	private String genString(int stringLenght) {

		// final String AZNUMBER =
		// "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		final String AZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

		Random random = new Random();

		StringBuilder sb = new StringBuilder(stringLenght);
		sb.append(AZ.charAt(random.nextInt(AZ.length())));
		for (int i = 0; i < stringLenght; i++) {
			sb.append(AZ.charAt(random.nextInt(AZ.length())));
		}
		String strnig = sb.toString().toLowerCase();
		return strnig.substring(0, 1).toUpperCase().concat(strnig.substring(1));

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
