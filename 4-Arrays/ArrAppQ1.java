//Q1. Write a java program to take input from array of size 5 and display it.

import java.util.Scanner;
public class ArrAppQ1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5]; //0
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Element");
		for(int i=0;i<a.length;i++)
		{
			
			System.out.printf("\na[%d]=%d\n",i,a[i]);
		}
		
	}
}
		
