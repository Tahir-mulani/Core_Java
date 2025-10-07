/*
Q11. Find Second Largest Element
Class: ArraySecondLargest
Functions:
void inputArray(int arr[])
int findSecondLargest()
Logic: First find max, then find element just smaller than max.
*/

import java.util.*;
class ArraySecondLargest
{
	int a[];
	void inputArray(int arr[])
	{
		a=arr;
	}
	int findSecondLargest()
	{
		int smax = Integer.MIN_VALUE;
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && a[i]!=max)
			{
				
				smax=a[i];
			}
			else
			{
			}
		}
		
		if(smax!=Integer.MIN_VALUE)
		{
			return smax;
		}
		else
		{
			return 0;
		}
	}
}
public class SecMaxArrApp
{
	public static void main(String x[])
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
			
		ArraySecondLargest sl = new ArraySecondLargest();
		sl.inputArray(arr);
		System.out.println("Second largest Element is = "+sl.findSecondLargest());
		
	}
}