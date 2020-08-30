package manis;

public class Main {
	public static void main(String[] args) {

		Bank ManisAccount = new Bank("Manikandan", 1000, "mani@gmail.com", "541626", "54615688");

		System.out.println(ManisAccount.getAccountBalance());
		System.out.println(ManisAccount.getAccountName());
		System.out.println(ManisAccount.getAccountNumber());

	
		  ManisAccount.setAccountBalance(0);
		  ManisAccount.setAccountName("Manikandan");
		  ManisAccount.setAccountNumber("123456789");
		  ManisAccount.setEmailAddress("mani@gmail.com");
		  ManisAccount.setPhoneNumber("44626648");
		  ManisAccount.deposit(23657);
		  ManisAccount.withdraw(32);
		 

		/*
		 * Bank Vijaysacc = new
		 * Bank("  Vijay account details :: vijay@gmail.com  ","  4343423  "
		 * ,"  4535675  "); System.out.println(Vijaysacc.getEmailAddress() +
		 * Vijaysacc.getAccountNumber() + Vijaysacc.getPhoneNumber());
		 * 
		 * vipCustomer Person1 = new vipCustomer();
		 * System.out.println(Person1.getEmailADD());
		 * 
		 * vipCustomer Person2 = new vipCustomer("Vijay","252434");
		 * System.out.println(Person2.getName());
		 * 
		 * vipCustomer Person3 = new vipCustomer("Rahul", "3325675780",
		 * " rahul@mail.com"); System.out.println(Person3.getName() +
		 * Person3.getEmailADD());
		 */

	}

}
