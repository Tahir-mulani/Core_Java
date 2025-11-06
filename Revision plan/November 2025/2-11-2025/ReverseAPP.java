//2.Write program to input number using Scanner class and reverse it?
import java.util.Scanner;
public class ReverseAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three digit number");
		int n=sc.nextInt();
		System.out.println("before Reverse "+n);
		int rev=((n%10)*100)+((n/10%10)*10)+(n/100);
		System.out.println("after Reverse "+rev);
	}
}