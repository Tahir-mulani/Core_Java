//Write a program to print the first n Fibonacci numbers using recursion.


import java.util.Scanner;
public class FibApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth term");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(fib(i)+" ");
		}
		
		
	}
	public static int fib(int n)
	{
		if(n<=1) return n;
		
		
		return  fib(n-1)+fib(n-2);
	}
}