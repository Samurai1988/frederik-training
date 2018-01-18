
import java.util.Scanner;
public class NewClass {
public static void main(String[] args)
{
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

System.out.println("The Sum is:"+sum(n));
}
public static int sum(int n)
{
if(n==0){
return 0;
}return(n+sum(n-1));
}
}





