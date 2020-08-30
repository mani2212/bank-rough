package manis;

public class vipCustomer {
	public String name;
	public String creditLimit;
	public String emailADD;

	public String getName() {
		return name;
	}
	public String getCreditLimit() {
		return creditLimit;
	}
	public String getEmailADD() {
		return emailADD;
	}
	public vipCustomer() {
		this("default name ", "45453","default@gmail.com");

	}
	public vipCustomer(String name, String creditLimit) {
		this(name,creditLimit,"emailADD");
	}
	public vipCustomer(String name, String creditLimit, String emailADD) {
		this.name = name ;
		this.creditLimit = creditLimit;
		this.emailADD = emailADD;
	}

}
