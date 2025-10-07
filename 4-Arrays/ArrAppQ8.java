//Q8. Write a java program to calculate the sum of even or odd numbers.

import java.util.Scanner;
public class ArrAppQ8
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Element");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		//find sum of even and Odd logic
		int sumeven=0,sumodd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sumeven = sumeven+a[i];
				
			}
			else
			{
				sumodd = sumodd+a[i];
			}
		}
		System.out.printf("\nsum of even numbers :%d",sumeven);
		System.out.printf("\nsum of odd numbers :%d",sumodd);
	}
}
				