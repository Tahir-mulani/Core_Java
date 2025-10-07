//Write a function to check if a number is an automorphic number (last digits = square of number).

import java.util.Scanner;
public class AutomorphicNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		boolean result= automorphic(n);
		if(result)
		{
			System.out.println("number is Automorfic Number");
		}
		else
		{
			System.out.println("Number is not Automorphic Number");
		}
	}
	public static boolean automorphic(int n)
	{
		int temp=n;
		int sq=n*n;
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		n=temp;
		int div=1;
		for(int i=1;i<=count;i++)
		{
			div=div*10;  
		}
		
			
		
		if((sq%div)==n) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
