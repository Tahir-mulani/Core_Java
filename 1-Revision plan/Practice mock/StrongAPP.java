//Q1. Write a java program to check whether number is Strong number or not.

import java.util.Scanner;
public class StrongAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp=n;
		
		int sum=0;
		while(n!=0)
		{
			int digit=n%10;
			int fact=1;
			for(int i=1;i<=digit;i++)
			{
				fact = fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		
		if(temp==sum)
		{
			System.out.println("strong");
		}
		else
		{
			System.out.println("not strong");
		}
	}
}
		