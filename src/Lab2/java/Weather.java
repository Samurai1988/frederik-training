package Lab2.java;

public class Weather {
	public static void main(String[] args) {
	
		int temperature = 70;
		String sunCondition = "Sunny";
		
		if (temperature > 80) {
			System.out.println("It s pleasent. Wear shorts and tshirt");			
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")){
			System.out.println("Its a little cooler, Perhaps wear a long sleeve shirt and jeans");
			System.out.println("Wear a hat to keep the sun out of your eyes.");
		}
		
	
		else {
			System.out.println("Looks like a cold day. Bring a sweater.");
			
		}
		System.out.println("The program is ending");
	}
}
