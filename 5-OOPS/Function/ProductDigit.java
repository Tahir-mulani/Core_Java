//Write a function to find the product of digits of a given number.

import java.util.Scanner;
public class ProductDigit
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n= sc.nextInt();
		productDigit(n);
	}
	public static void productDigit(int n)
	{
		int prod=1;
		while(n!=0)
		{
			int digit=n%10;
			prod=prod*digit;
			n=n/10;
		}
		System.out.println("product of digits is : "+prod);
	}
}