//Write a function to find the sum of squares of first n natural numbers.

import java.util.Scanner;
public class SumSquareNatu
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
	}
	public static void sumSquare(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			int sq=i*i;
			sum=sum+sq;
		}
		System.out.println("sum of squares of natural number is "+sum);
			
	}
}

