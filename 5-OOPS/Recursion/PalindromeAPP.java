//Write a program to check whether a given number is a palindrome using recursion.

import java.util.Scanner;
public class PalindromeAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int rev=0,digit=0;
		int temp=n;
		int result = palindrome(n,rev,digit);
		if(result==temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
	public static int palindrome(int n,int rev,int digit)
	{
		if(n==0)
		{
			return rev;
		}
		digit=n%10;
		rev=rev*10+digit;
		return  palindrome(n/10,rev,digit);
	}
}