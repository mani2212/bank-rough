package manis;

public class Bank {
	public String accountName;
	public double accountBalance;
	public String emailAddress;
	public String accountNumber;
	public String phoneNumber;
	
	public Bank() {
		this("Mani",100,"mani@gmail.com","43454","45356767");
		System.out.println("Constructer called ");
	}
	
	public Bank(String accountName,double accountBalance,String emailAddress,
			String accountNumber, String phoneNumber ) {
		System.out.println("Account parameters called ");
		this.accountName = accountName;
		this.accountBalance = accountBalance;
		this.emailAddress = emailAddress;
		this.accountNumber = accountNumber;
		this.phoneNumber = phoneNumber;
		
	}
	
	
	public Bank(String emailAddress, String accountNumber, String phoneNumber) {
		this("Mani", 1000, emailAddress,accountNumber,phoneNumber);
		this.emailAddress = emailAddress;
		this.accountNumber = accountNumber;
		this.phoneNumber = phoneNumber;
	}

	public void deposit(double depositAmount) {
		this.accountBalance += depositAmount; 
		System.out.println(depositAmount +"rs successfully deposited to your account ! ! " 
				+ " New balance is " + this.accountBalance);
	}
	public void withdraw(double withdrawAmount) {
	if(this.accountBalance - withdrawAmount < 0 ) {
		System.out.println("Current balance is only " + this.accountBalance + " . Withdrawal of rs :"
				 + withdrawAmount + " failed " );
	}
	else {
		this.accountBalance -= withdrawAmount;
		System.out.println("Transaction successful for withdrawal  ! " + withdrawAmount +
				" . New balance is " + this.accountBalance);
	}
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public String getAccountName() {
		System.out.println("Account name registered :" ) ;
		return accountName;
		
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
