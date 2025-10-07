//7.Write a program using for loop to check whether a given number is palindrome.

import java.util.*;
public class CheckPalindrome
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number from keyboard");
		int n=sc.nextInt();
		int temp=n,rev=0,rem=0;
		for(;n!=0;n=n/10)
		{
			rem=n%10;
			rev=rev*10+rem;
		}
		n=temp;
		String str=(n==rev)?"palindrom":"Not palindrom";
		System.out.println(str);
	}
}