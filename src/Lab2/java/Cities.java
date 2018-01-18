package Lab2.java;

public class Cities {
	
	public static void main(String[] args) {
	String[] cities = {"New York", "San Francisco", "Miami"};
	System.out.println(cities[0]);
	System.out.println(cities[1]);
	
	
	
	
	
	String[] countries;
	
	countries = new String[2];
	countries[0] = "USA";
	countries[1] = "Canada";
	System.out.println(countries[0]);
	
	
	
	
	
	String[] states = new String [3];
	states[0] = "California";
	states[1] = "Ohio";
	states[2] = "Zurich";
	
	int i = 0;
	do {
		System.out.println("State: " + states[i]);
		i = i + 1;
	} while (i < 3);
	
	
	
	
	int n = 0;
	boolean Statefound = false;
	while (!Statefound) {
		String state = states[n];
		if(state == "Ohio") {
			System.out.println("State Found");
			Statefound = true;
		}
		n++;
		
	}
		System.out.println("Printing with for Loop");
		
	for (int x = 0; i < 3; x++) {	
	System.out.println(states[x]);
	
		}
	}
}
	
	
 