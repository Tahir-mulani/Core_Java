//Write a function to count the number of digits in a given number.

import java.util.Scanner;
public class CountDigit
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		countDigit(n);
	}
	public static void countDigit(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		System.out.println("Count of Digits in given number is:"+count);
	}
}
