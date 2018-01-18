package labs;

public class AssignementFrederikBullLarsen2 {
	
		public static void main(String[] args) {
				System.out.print(fac(4));	
		}
		public static int fac(int n) {

		       if(n==0 || n==1)
		         return 1;

		       return n * fac(n-1);
		       
		    }
		}

