/*
Reverse a Number
Create a class NumberReverser with a method reverse that reverses a given integer number.
Explanation: Covers basic loops for number manipulation.
*/

import java.util.Scanner;
public class ReverseApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		
		NumberReverser rv = new NumberReverser();
		System.out.println("Number befoore Reverser: "+n);
		int result = rv.reverseNum(n);
		System.out.println("Number after Reverser: "+result);
	
	}
}
class NumberReverser
{
	int reverseNum(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
}
			
