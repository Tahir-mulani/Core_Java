//Write a function to find the sum of first n natural numbers.

import java.util.Scanner;
public class SumNatural
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		sumNatural(n);
	}
	public static void sumNatural(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.printf("Sum of first natural number is= %d",sum);
	}
}