package Lab2.java;

public class Numbers {

		public static void main(String[]args) {
			System.out.println("Program is starting");
			printName();
			int numA = 10;
			int numB = 20;
			addNumbers(numA, numB);
			int product = multiplyNumbers(numA, numB);
			System.out.println("The Product is " + product);
		}
		
		static void printName() {
			System.out.println("My name is Frederik");
			
		}
		
		static void addNumbers(int numberA, int numberB) {
			int sum = numberA + numberB;
			System.out.println("Sum:" + sum);
			}
		
		static int multiplyNumbers(int valueA, int valueB) {
			int product = valueA * valueB;
			addNumbers(product, product);
			return product;
		}
	}

For n
fib(2) = fib(0)+fib(1);

	
	
	

