package by.htp.excustomer.start;

import by.htp.excustomer.entity.Customer;
import by.htp.excustomer.logic.CustomerLogic;
import by.htp.excustomer.entity.CustomerData;
import by.htp.excustomer.generator.CustomerGenerator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 7;

		CustomerLogic logic = new CustomerLogic();
		CustomerGenerator cuGen = new CustomerGenerator();
		CustomerData customers = new CustomerData(cuGen.genCustomer(size));

		customers.getCustomers().add(logic.createCustomer(11, "Ivanoz", "Ivan", "st", 1001, 10001));
		customers.getCustomers().add(logic.createCustomer(12, "Ivanov", "Iva", "st", 1002, 10002));

		System.out.println("////////////////show////////////////");
		for (Customer customer : customers.getCustomers()) {
			System.out.println(customer.toString());
		}

		System.out.println();
		System.out.println("////////////////sort////////////////");
		logic.sortCustomer(customers.getCustomers());
		for (Customer customer : customers.getCustomers()) {

			System.out.println(customer.toString());

		}

		System.out.println();
		System.out.println("////////////////sortRev////////////////");
		logic.sortCustomerReverse(customers.getCustomers());
		for (Customer customer : customers.getCustomers()) {

			System.out.println(customer.toString());

		}

		System.out.println();
		System.out.println("///////////////rangeCardNumber/////////////////");
		logic.showRangeCardNumber(customers.getCustomers(), 1005, 1250);
	}

}
