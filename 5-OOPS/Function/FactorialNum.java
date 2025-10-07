//Write a function to calculate the factorial of a number (using loop only).

import java.util.Scanner;
public class FactorialNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int result = fact(n);
		System.out.println(result);
		
	}
	public static int fact(int n)
	{
		int fact=1;
		int i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;			
		}
		return fact;
		
	}
}
