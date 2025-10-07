/*
Find GCD of Two Numbers
Create a class GCDCalculator with a method findGCD to compute the greatest common divisor of two numbers.
Explanation: Introduces loops and mathematical relationships.
*/

import java.util.Scanner;
public class GCDAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		GCDCalculator gcd=new GCDCalculator();
		int result=gcd.findGCD(a,b);
		System.out.printf("Greatest Common Divisor is = %d",result);
	}
}
class GCDCalculator
{
	int findGCD(int a,int b)
	{
		int min;
		if(a>b)
		{
			min=b;
		}
		else
		{
			min=a;
		}
		int max=0;
		
		for(int i=1;i<=min;i++)
		{
			if(a%i==0 && b%i==0)
			{
				if(i>max)
				{
					max=i;
				}
			}
		}
		return max;
		
				
	}
}
