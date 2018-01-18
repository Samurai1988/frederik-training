package OOP;

public class LoanAccount implements IRate{

	public void setRate() {
		System.out.println("setting rate");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("Increase more");
		
	}
	public void setTerm(int term) {
		System.out.println("Setting the term to: " + term + "years.");
	}
	public void setAmortSchedule(int term2) {
		System.out.println("Amortization Scedule" + term2);
	}
}
