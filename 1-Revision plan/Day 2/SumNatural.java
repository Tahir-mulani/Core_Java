//3.Write a program using for loop to calculate the sum of the first 100 natural numbers.

import java.util.*;
public class SumNatural
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n=100,sum=0;
		
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.printf("sum of first 100 natural numbers: %d\n",sum);
	}
}