/*
Check if Subarray with Given Sum Exists
For a given sum, check if there’s a subarray with that sum using sliding window.
*/

import java.util.*;
public class SumExistArr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		
		System.out.println("Enter array element");
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter size k");
		int k = sc.nextInt();
		
		System.out.println("enter target");
		int target = sc.nextInt();
		
		int sum=0;
		boolean flag=false;
		for(int i=0;i<k;i++)
		{
			sum=sum+a[i];
		}
		for(int i=k;i<a.length;i++)
		{
			//System.out.printf("%d\t",sum);
			sum = sum+(a[i] -a[i-k]);
			if(sum==target)
			{
				System.out.printf("%d\t",sum);
				flag=true;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("target found");
		}
		else
		{
			System.out.println("not found target");
		}
	}
}