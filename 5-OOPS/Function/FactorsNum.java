//Write a function to print the factors of a number.

import java.util.Scanner;
public class FactorsNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		factor(n);
		
	}
	public static void factor(int n)
	{
		int i=1;
		
		while(i<=n)
		{
			
			if(n%i==0)
			{
				System.out.printf("%d\t",i);
			}
			i++;
		}
		
	}
}
