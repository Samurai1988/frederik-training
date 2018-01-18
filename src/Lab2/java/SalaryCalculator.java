package Lab2.java;

public class SalaryCalculator {
	public static void main(String[] args) {
		String career;
		System.out.println("Program is starting");
		career ="Software Developer";
		System.out.println("My career; " + career);
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "Webdeveloper";
		
		double salary = hoursPerWeek * weeksPerYear* rate;
		System.out.println("My salary as a" + career +" at the rate of USD" + rate + "per hour is USD" + salary + "per year.");
	}
}
