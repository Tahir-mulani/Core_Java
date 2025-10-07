/*Reverse a Number
Write a function reverseNumber(int n) that returns the reverse of a given number.
Example: Input 456 → Output: 654.
*/

import java.util.*;
public class  Reverse
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int result= reverseNumber(n);
		System.out.println("Reverse is " +result);
	}
	public static int reverseNumber(int n)
	{
		int rev=0,rem;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
}
		
		