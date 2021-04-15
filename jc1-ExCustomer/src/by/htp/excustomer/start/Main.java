package by.htp.excustomer.start;

import by.htp.excustomer.entity.Customer;
import by.htp.excustomer.logic.CustomerLogic;
import by.htp.excustomer.entity.CustomerData;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 7;

		CustomerLogic logic = new CustomerLogic();
		CustomerData customers = new CustomerData(logic.genCustomer(size));
		// CustomerPrint view = new CustomerPrint();

		customers.getCustomers().add(new Customer(11, "Ivanoz", "Ivan", "st", 1001, 10001));
		customers.getCustomers().add(new Customer(12, "Ivanov", "Iva", "st", 1002, 10002));

		for (Customer customer : customers.getCustomers()) {
			System.out.println(customer.toString());
		}

		System.out.println("////////////////sort////////////////");
		logic.sortCustomer(customers.getCustomers());
		for (Customer customer : customers.getCustomers()) {
			System.out.println(customer.toString());
		}

		System.out.println("////////////////sortRev////////////////");
		logic.sortCustomerReverse(customers.getCustomers());
		for (Customer customer : customers.getCustomers()) {
			System.out.println(customer.toString());
		}

		System.out.println("///////////////rangeCardNumber/////////////////");
		logic.showRangeCardNumber(customers.getCustomers(), 1005, 1250);
	}

}
