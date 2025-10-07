//Write a program to find the greatest common divisor (GCD) of two numbers using recursion.

import java.util.Scanner;
public class GCDAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a=12;
		int b=18;

		int result=GCD(a,b);
		System.out.println(result);
	}
	static int  GCD(int a,int b)
	{
		
		
		if(a==0 || b==0)
		{
			return 1;
		}
		
		int min=0;
		if(a<b)
		{
			min=a;
		}
		else
		{
			min=b;
		}
		
		return GCD(a-1,b-1);
				
	}
}