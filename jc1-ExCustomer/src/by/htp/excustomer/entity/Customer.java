package by.htp.excustomer.entity;

////id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + bankAccountNumber;
		result = prime * result + creditCardNumber;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((midleName == null) ? 0 : midleName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bankAccountNumber != other.bankAccountNumber)
			return false;
		if (creditCardNumber != other.creditCardNumber)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (midleName == null) {
			if (other.midleName != null)
				return false;
		} else if (!midleName.equals(other.midleName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", midleName=" + midleName
				+ ", address=" + address + ", creditCardNumber=" + creditCardNumber + ", bankAccountNumber="
				+ bankAccountNumber + "]";
	}

}
