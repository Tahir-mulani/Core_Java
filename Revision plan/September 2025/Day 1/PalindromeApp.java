//7.Write a program to input numbers and check if the number is palindrome or not?

import java.util.Scanner;
public class PalindromeApp
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter number");
		n=sc.nextInt();
		int rev=0,rem=0;
		int temp=n;
		
		//palindrome logic.
		while(n!=0)  
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		n=temp;
		String str=(n==rev)? "palindrome number":"not palindrome number";
		System.out.println(str);			
	}
}