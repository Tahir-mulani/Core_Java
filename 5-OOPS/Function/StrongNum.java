//Write a function to check if a number is a strong number (sum of factorial of digits = number).

import java.util.Scanner;
public class StrongNum
{
	public static void main(String x[])
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");  
		int n =sc.nextInt();
		boolean result = strong(n);
		if(result)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
	}
	public static boolean strong(int n)  
	{
		int temp=n;   
		int sum=0;
		while(n!=0)
		{
			int digit=n%10;
			int i=1;
			int fact=1;
			while(i<=digit)   
			{
				fact=fact*i;  
				i++;
			}
			
			sum=sum+fact;    //0+120
			n=n/10;
		}
		n=temp;
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