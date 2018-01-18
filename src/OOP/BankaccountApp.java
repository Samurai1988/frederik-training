package OOP;

public class BankaccountApp {
	
	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount();
		
		acc1.setName("Roger Huge");
		System.out.println(acc1.getName());
		acc1.setSSN("234098123");
		System.out.println(acc1.getSSN());
		
		acc1.accountNumber = "3450982344";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(2000);
		acc1.deposit(-300);
		acc1.withdraw(1000);
		
		System.out.println(acc1.toString());
		
		BankAccount acc2 = new BankAccount();
		
		acc2.setName("Ben Huge");
		System.out.println(acc2.getName());
		acc2.setSSN("12349098123");
		System.out.println(acc2.getSSN());
		
	BankAccount acc2 = new BankAccount();
		
		acc2.setName("ben Huge");
		System.out.println(acc2.getName());
		
		
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "23405981324";
		System.out.println(acc2.toString());
		
		BankAccount acc3 = new BankAccount("Savings Account", 10000);
		acc3.accountNumber = "234591234";
		acc3.checkBalance();
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = 4.5;
		cd1.name = "Julian";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		double totalamount = cd1.balance * (cd1.interestRate/100 + 1);
		System.out.println(totalamount);
		cd1.TotalAmount();
		
		
		
		}
		}
