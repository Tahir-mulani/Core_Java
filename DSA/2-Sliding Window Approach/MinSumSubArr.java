/*
Minimum Sum Subarray of Size K
Find the minimum sum of a subarray with size k.
*/

import java.util.*;
public class MinSumSubArr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		
		System.out.println("Enter array element");
		int a[] = new int [n];
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter size of k");
		int k=sc.nextInt();
		
		//int min=Integer.MAX_VALUE;
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum=sum+a[i];
			
			
		}
		int min=sum;
		for(int i=k;i<a.length;i++)
		{         
			sum = sum+(a[i]+a[i-k]);     //add new , remove old.
			if(sum<min)
			{
				min=sum;
			}
		}
		System.out.printf("Minimum sum is %d\n",min);
	}
}
			
			
		
		