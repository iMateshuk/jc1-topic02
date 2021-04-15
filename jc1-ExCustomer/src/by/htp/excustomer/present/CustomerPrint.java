package by.htp.excustomer.present;

import by.htp.excustomer.entity.Customer;

public class CustomerPrint {

	public void print(Customer customer) {
		System.out.println("id:" + customer.getId() + ", lastName:" + customer.getLastName() + ", firstName:"
				+ customer.getFirstName() + ", midleName:" + customer.getMidleName() + ", address:"
				+ customer.getAddress() + ", creditCardNumber:" + customer.getCreditCardNumber()
				+ ", bankAccountNumber:" + customer.getBankAccountNumber());
	}

}
