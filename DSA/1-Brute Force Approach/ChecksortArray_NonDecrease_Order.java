/*
4. Check If Array Is Sorted
 Problem:
Determine whether an array is sorted in non-decreasing order.
Example:
Input: [1, 2, 2, 3, 4]  
Output: true
*/

import java.util.Scanner;
public class ChecksortArray_NonDecrease_Order
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		int b[]=new int[a.length];
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[i]>=a[j])
				{
					flag=true;
					continue;
				}
				else
				{
					flag=false;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}