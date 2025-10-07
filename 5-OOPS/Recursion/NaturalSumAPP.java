//Write a program to find the sum of first n natural numbers using recursion.

import java.util.Scanner;
public class NaturalSumAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nth number");
		int n=sc.nextInt();
		
		System.out.println(isSum(n));
	
	}
	static int isSum(int n)
	{
		if(n==0) return 0;
		
		return  n+ isSum(n-1);
	}
}
