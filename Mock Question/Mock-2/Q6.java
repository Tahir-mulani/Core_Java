/*Q6. Write a java program to Check If a Number Is a Spy Number
or Not spy number using function recursion.
*/

import java.util.Scanner;
public class Q6
{	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int mul=1;
		int sum=0;
		int  result = recursion(n,mul,sum);
		if(sum==mul)
		{
			System.out.println("Number is SPY Number");
		}
		else
		{
			System.out.println("Number is Not SPY Number");
		}
	}
	public static int recursion(int n,int mul,int sum)
	{
		
		if(n==0)
		{
			return (sum,mul);
		}
		int digit=n%10;
		recursion =(n/10;,mul*digit,sum+digit);
	}
		
}