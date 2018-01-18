package labs;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("Frederik", "43455817");
		Student stu2 = new Student("Edwina", "9105583");
	}

}

class Student {
	private static int iD=1000;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String courses = "";
	
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
		
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "," + iD + "@gmail.com";
		System.out.println("your email:" + email);
		
	}
	
	private void setUserId() {
		int max = 10000;
		int min = 1000;
		int randNum = (int) (Math.random() * ((max - min)));
		randNum = randNum + min;
		userId = iD + "" + randNum + ssn.substring(6);
		System.out.println("Your User Id is" + userId);
	}


}

public class NewAssignement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewAssignement stu1 = new NewAssignement("12390234234", "John Locke");
		NewAssignement stu2 = new NewAssignement("34562345234", "Immanuel Kant");
		NewAssignement stu3 = new NewAssignement("23459234512", "David Hume");
	}

}

class Student {
	private static int iD=1000;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String courses = "";
	
	public Student(String SSN, String name) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
		
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "," + iD + "@gmail.com";
		System.out.println("your email:" + email);
		
	}
	
	private void setUserId() {
		int max = 10000;
		int min = 1000;
		int randNum = (int) (Math.random() * ((max - min)));
		randNum = randNum + min;
		userId = iD + "" + randNum + ssn.substring(6);
		System.out.println("Your User Id is" + userId);
	}