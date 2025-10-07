//Write a function to generate the Fibonacci series up to n terms.

import java.util.Scanner;
public class FibSeries
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a=0;
		System.out.println("Enter nth term");
		int n=sc.nextInt();
		fibSeries(a,n);
	}
	public static void fibSeries(int a,int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.printf("%d\t",a);
			int next=a+i;
			i=a;
			a=next;
		}
			
	}
}
		
	