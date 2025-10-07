//Q2. Write a java program to calculate sum of array is size 5.

import java.util.Scanner;
public class ArrAppQ2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		int a[]= new int[5];
		System.out.println("Enter Array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of Array is : " +sum);
	}
}
		