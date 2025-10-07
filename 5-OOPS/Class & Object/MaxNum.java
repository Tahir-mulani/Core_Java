/*
Find the Maximum of Three Numbers
Create a class MaxFinder with a method findMax that returns the largest of three numbers.
Explanation: Enhances problem-solving using conditional statements.
*/

import java.util.Scanner;
class MaxFinder
{
	void findMax(int a,int b,int c)
	{
		String str=(a>b && a>c)? "first is Max":(b>a && b>c)? "Second is Max" :"Third is Max";
		System.out.println(str);
	}
}
public class MaxNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		MaxFinder mx = new MaxFinder();
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		System.out.println("Enter Third Number");
		int c = sc.nextInt();
		mx.findMax(a,b,c);
	}
}
		