//1.Write a program to find the second largest element in an array.

import java.util.*;
public class SecMax
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int smax=Integer.MIN_VALUE;
		int max=a[0];
		
		//find second max value.
		for(int i=0;i<a.length;i++)       //10 50 40 30 20
		{
			
			if(a[i]>max)  //
			{
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && max!=a[i])
			{
				smax=a[i];
			}
			else
			{
			}
	
		}
		if(smax!=Integer.MIN_VALUE)
		{
			System.out.printf("\nSecond largest element is: %d",smax);
		}
		else
		{
			System.out.println("there is no scond largest element in this array");
		}
	}
}