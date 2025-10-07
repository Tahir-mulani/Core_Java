//Write a function to find the sum of cubes of first n natural numbers.

import java.util.Scanner;
public class SumCubeNatu
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		cubeSum(n);
	}
	public static void cubeSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			int cube=i*i*i;
			sum=sum+cube;
		}
		System.out.println("sum of squares of natural number is "+sum);
	}
}
