//Write a program to calculate the factorial of a given number using recursion.

import java.util.Scanner;
public class Factorial
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
	
		int result = factorial(n);
		System.out.println(result);
		
	}
	public static int factorial(int n)
	{
		
		if(n<=1)
		{
			return 1;
		}
		
		return n*factorial(n-1);
		
	}
}