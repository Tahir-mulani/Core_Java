/*
Calculate Sum of Digits
Create a class DigitSumCalculator with a method calculateSum that computes the sum of digits of a number.
Explanation: Practices loops for digit extraction.
*/

import java.util.Scanner;
public class SumDigitApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		DigitSumCalculator d = new DigitSumCalculator();
		d.calculateSum(n);
	}
}
class DigitSumCalculator
{
	void calculateSum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.printf("Sum of Digits of Number = %d",sum);
	}
}
