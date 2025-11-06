//7.Write a program to input number and check number is palindrome or not?
import java.util.Scanner;
public class PalindromeAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int rev=0;
		int temp=n;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not Palindrome");
		}
	}
}