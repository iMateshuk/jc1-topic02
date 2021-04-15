package by.htp.excustomer.generator;

import java.util.ArrayList;
import java.util.Random;

import by.htp.excustomer.entity.Customer;

public class CustomerGenerator {
	
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

}
