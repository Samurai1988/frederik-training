package OOP;

public class NewBankAccountApp {

	public static void main(String[] args) {
		NewBankAccount acc1 = new NewBankAccount("12390234234", 5000);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(1500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}

class NewBankAccount implements Iinterest {
	//Properties of bank account
	private static int iD = 100;
	private String accountNumber;
	private static final String routingNumber = "098234345";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public NewBankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
		
		
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 10);
		accountNumber = iD + "" + random + SSN.substring(0, 3);
		System.out.println(accountNumber);
		
	}
	
	public void setName(String name) {
		this.name = name;

	}
	public String getName() {
		return name;
	}
	public void payBill(double amount) {
		 balance = balance-amount;
		 System.out.println("Paying bill: " + amount);
		 showBalance();
	 }
	public void makeDeposit(double amount) {
		System.out.println("Making deposit: " + amount);
		 balance = balance+amount;
		 showBalance();
	 }
	public void showBalance() {
		 System.out.println("Balance: " + balance);
	 }
	public void accrue() {
		balance = balance * (1 + rate/100);
		System.out.println("Accrued Balance: " + balance);
	}
	
	public String toString() {
		return ("[ " + name + "," + accountNumber + " Balance: USD " + balance + "RoutingNr " + routingNumber + " ]");
	}
	
}
