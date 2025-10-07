/*
Maximum Sum Subarray of Size K
Find the maximum sum of a subarray with size k.
*/

import java.util.*;
public class MaxSumSubArr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextIn();
		int a[] = new int [];
		System.out.println("Enter array element");
		for(int i=0;i<a.lengthl;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("enter size k");
		int k=sc.nextInt();
		
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum=sum+a[i];            //create first window
			
		}
		for(int i=k;i<a.length;i++)
		{
			sum=sum+(a[i] + a[i-k]);   //add new , remove old
			if(sum>max)
			{
				max=sum;
			}
		}
		System.out.printf("\nMax value is %d\n",max);
	}
}