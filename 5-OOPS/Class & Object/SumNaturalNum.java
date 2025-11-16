/*
Calculate Sum of 1 to Nth Natural Numbers
Create a class NaturalNumberSum with a method calculateSum that computes the sum of the 1 to Nth natural numbers.
Explanation: Reinforces loops and arithmetic series formula.
*/

import java.util.Scanner;
public class SumNaturalNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nth Number");
		int n = sc.nextInt();
		NaturalNumberSum natural=new NaturalNumberSum();
		int result=natural.calculateSum(n);
		System.out.println("Sum of Natural Number: "+result);
	}
}
class NaturalNumberSum()
{
	int calculateSum(int n)
	{
		int sum=0;
		int i=1;
		while(i<=n)
		{
			sum=sum+i;
			i++
		}
		return sum;
	}
}
		