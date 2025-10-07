//Write a function to check if a number is a perfect number.

import java.util.Scanner;
public class PerfectNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		boolean result = perfect(n);
		if(result)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not Perfect Number");
		}
	}
	public static boolean perfect(int n)
	{
		int i=1;
		int sum=0;
		int temp=n;
		while(i<n)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		n=temp;
		if(n==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}