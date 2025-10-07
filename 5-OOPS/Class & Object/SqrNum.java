/*
 Find Square of a Number
Create a class SquareFinder with a method square that calculates the square of a number.
Explanation: Covers single-parameter logic in methods.
*/

import java.util.Scanner;
public class SqrNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		SquareFinder s = new SquareFinder();
		System.out.println("Enter number");
		int n=sc.nextInt();
		int result=s.isSquare(n);
		System.out.println("Square of number is : "+result);
		
	}
}

class SquareFinder
{
	int isSquare(int n)
	{
		int sq=n*n;
		return sq;
	}
}
		
