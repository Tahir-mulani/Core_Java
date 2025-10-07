/*Check Prime Number
Write a function isPrime(int n) that checks if a number is prime or not.
Use it in main() to test different inputs.
*/

import java.util.*;
public class PrimeNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		
		String result = isPrime(n);
		System.out.println(result);
		
	}
	public static String isPrime(int n)
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
			return "is Prime";
		}
		else
		{
			return "is not Prime";
		}
	}
}
