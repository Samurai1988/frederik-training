package OOP;

public class NewAssignement2 {

	public static void main(String[] args) {
		NewAssignement stu1 = new NewAssignement("12390234234", "John Locke");
		NewAssignement stu2 = new NewAssignement("34562345234", "Immanuel Kant");
		NewAssignement stu3 = new NewAssignement("23459234512", "David Hume");
		
		stu1.enroll("Maths");
		stu1.pay(100);
		System.out.println(stu1.toString());
		
		stu2.enroll("French");
		stu2.pay(300);
		System.out.println(stu2.toString());
		
		stu3.enroll("History");
		stu3.pay(400);
		System.out.println(stu3.toString());
		
		stu1.showCourses();
		stu2.showCourses();
		stu3.showCourses();
		
		stu1.setphone("+41 79223434");
		stu2.setphone("+41 79674231");
		stu3.setphone("+41 79623412");
		
		System.out.println(stu1.getphone());
		System.out.println(stu2.getphone());
		System.out.println(stu3.getphone());
		
		stu1.setcity("Zurich");
		stu2.setcity("Berlin");
		stu3.setcity("Hamburg");
		
		System.out.println(stu1.getcity());
		System.out.println(stu2.getcity());
		System.out.println(stu3.getcity());
	}
}

class NewAssignement {
	
	//Properties of bank account
	
	private static int iD=1000;
	private String SSN;
	private String email;
	private String name;
	private String userID;
	double balance = 0;
	private String course;
	private static final int costofcourse = 800;
	private String phone;
	private String city;
	
	
	
	
	
	//Constructor
	public NewAssignement(String SSN, String name) {
		iD++;
		this.SSN = SSN;
		this.name = name;
		System.out.println("This is the SSN:  " + SSN + "" + name);
		setiD2();
		setEmail2();
	}
	public void enroll(String course) {
		this.course = this.course + course;
		balance = balance - costofcourse;
	}
	private void setiD2() {
		int max = 10000;
		int min = 1000;
		int randNum = (int) (Math.random() * ((max - min)));
		userID = iD + randNum + SSN.substring(6);
		System.out.println("The students UserID is: " + userID);
	}
	private void setEmail2() {
		email = name.toLowerCase() + "," + iD + "@gmail.com";
		System.out.println("Student Email: " + email);	
	}	
	public void pay(double amount) {
		balance = balance + amount;				
	}
	public void checkbalance() {	
		System.out.println(balance);
	}
	public String toString() {
		return ("[The Clients Name is:" + "," + name + " Balance: USD " + balance + "]");
	}
	public void showCourses() {
		System.out.println(name + course);
	}
	
	public String getphone() {
		return phone;
		
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city = city;
	}
}

