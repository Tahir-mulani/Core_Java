/*
Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.
*/

import java.util.Scanner;
class numberComparision
{
	void compareNum(int a,int b)
	{
		String str=(a>b)?"a is greater":(a<b)? "b is greater":"both are qual";
		System.out.println(str);
	}
	
	
}
public class CompareApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		numberComparision comp = new numberComparision();
		System.out.println("Enter First Number a:");
		int a=sc.nextInt();
		System.out.println("Enter Second Number b:");
		int b=sc.nextInt();
		comp.compareNum(a,b);
	}
}