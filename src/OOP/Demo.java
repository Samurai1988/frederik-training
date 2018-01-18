package OOP;


class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	void sleep() {
		System.out.println(name + " is eating");
	}
	}
	
public class Demo {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "joeattestemail.com";
		person1.phone = "234098123098";
		
		person1.walk();
		person1.eat();
		person1.sleep();
		
		
	}
	}

	
	
