/*Palindrome Check (Number or String)
Write a function isPalindrome(int n) that checks whether a number is palindrome or not.
Example: Input 121 → true.
*/

import java.util.*;
public class Palindrome
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		String result=ispalindrome(n);
		
		System.out.println("number is " +result);
	}
	public static String ispalindrome(int n)
	{
		int rev=0,rem;
		int temp=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		n=temp;
		if(rev==n)
		{
		   return "Palindrome";	
		}
		else
		{
			return "not palindrome";
		}
	}
}