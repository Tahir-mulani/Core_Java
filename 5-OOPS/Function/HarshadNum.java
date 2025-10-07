//Write a function to check whether a number is a Harshad number (divisible by sum of its digits).

import java.util.Scanner;
public class HarshadNum
{
	public static void main(String x[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		boolean result = harshadNum(n);
		if(result)
		{
			System.out.println("Number is Harshad Number");
		}
		else
		{
			System.out.println("Number is not Harshad Number");
		}		
	}
	public static boolean harshadNum(int n)
	{
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			sum+=n%10;
			n=n/10;
		}
		n=temp;
		if(n%sum==0)
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	
}