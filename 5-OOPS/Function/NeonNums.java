//Write a function to check whether the given number is a neon number (sum of digits of square = number).

import java.util.Scanner;
public class NeonNums
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		boolean result = neonNum(n);
		if(result)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("Not Neon Number");
		}
	}
	public static boolean neonNum(int n)
	{
		int sum=0;
		int sq=n*n;
		while(sq!=0)
		{
			int digit=sq%10;
			sum=sum+digit;
			sq=sq/10;
		}
		
		if(sum==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
		