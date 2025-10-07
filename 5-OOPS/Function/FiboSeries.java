/*Fibonacci Series (n terms)
Write a function printFibonacci(int n) that prints the first n terms of the Fibonacci series.
Example: Input 5 → 0 1 1 2 3.
*/

import java.util.*;
public class FiboSeries
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter terms");
		int n=sc.nextInt();
		fiboseries(n);		
	}
	public static void fiboseries(int n)
	{
		int c;
		int a=0;
		int b=1;
		for(int i=0;i<n;i++)
		{
			System.out.print(a);
			c=a+b;
			a=b;
			b=c;
		}
		
			
	}
}