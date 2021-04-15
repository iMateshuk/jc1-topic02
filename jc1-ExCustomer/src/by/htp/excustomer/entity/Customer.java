package by.htp.excustomer.entity;

//id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. 
public class Customer {
	private int id;
	private String lastName;
	private String firstName;
	private String midleName;
	private String address;
	private int creditCardNumber;
	private int bankAccountNumber;

	public Customer(int id, String lastName, String firstName, String address, int creditCardNumber, int bankAccountNumber) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.midleName = "noMidleName";
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public Customer(int id, String lastName, String firstName, String midleName, String address, int creditCardNumber, int bankAccountNumber) {
		this(id, lastName, firstName, address, creditCardNumber, bankAccountNumber);
		this.midleName = midleName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMidleName() {
		return midleName;
	}

	public void setMidleName(String midleName) {
		this.midleName = midleName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setbankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", midleName=" + midleName
				+ ", address=" + address + ", creditCardNumber=" + creditCardNumber + ", bankAccountNumber="
				+ bankAccountNumber + "]";
	}

}
