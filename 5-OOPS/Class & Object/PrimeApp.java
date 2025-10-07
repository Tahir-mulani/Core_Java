/*
Check for Prime Numbers
Create a class PrimeChecker with a method isPrime to check if a number is prime.
Explanation: Introduces number theory logic.
*/

import java.util.Scanner;
public class PrimeApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		PrimeChecker p = new PrimeChecker();
		boolean result = p.isPrime(n);
		if(result)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}
	}

}
class PrimeChecker
{
	boolean isPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;	
			}
			
		}
		
		if(count==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
