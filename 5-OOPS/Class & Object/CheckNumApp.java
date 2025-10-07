/*
 Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
Explanation: Focuses on using modulus operator in logic.
*/

import java.util.Scanner;
class NumberChecker
{
	boolean isEven(int a)
	{
		if(a%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
			
}
public class CheckNumApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		NumberChecker num = new NumberChecker();
		System.out.println("Enter number");
		int a=sc.nextInt();
		boolean result = num.isEven(a);
		if(result)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		
	}
}