package OOP;

public class BankAccount implements IRate {

	String accountNumber;
	private static final String routingNumber = "111111";
	String name;
	private String SSN;
	String accountType;
	double balance = 0;
	
	
	
	BankAccount() {
		System.out.println("New Account Created");
	}
	
	BankAccount(String accountType) {
		System.out.println("New Account: "+ accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		System.out.println("New Account: "+ accountType);
		System.out.println("Initial Deposit: "+ initDeposit);
		String Msg = null;
		
		if(initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least 1000USD";
		}	else {
			Msg = "Thanks for your initial deposit of: USD:";
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	public void setName(String name) {
		this.name = "Mr. " + name;
		
	}
	public String getName() {
		return name;
	}
	
	public String getSSN() {
		return SSN;
		
	}
	public void setSSN(String sSN) {
		SSN = sSN;
		
	}	
		public void setRate() {
			System.out.println("Setting Rate");
		}

		
		public void increaseRate() {
			System.out.println("Increase Rate");
					
		}

	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
		
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("Withdraw");
}
	void checkBalance() {
		System.out.println("Balance: " + balance);

}
	private void showActivity(String activity) {
		System.out.println("Your recent transaction" + activity);
		System.out.println("Your new balance is: USD" + balance);
		
	}
	
	public String toString() {
		return ("[ " + name + "," + accountNumber + " Balance: USD " + balance + "RoutingNr " + routingNumber + " ]");
	}
}
