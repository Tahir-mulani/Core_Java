/*
Q14. Find Pair of Elements with Given Sum
Class: ArrayPairSum
Functions:
void inputArray(int arr[])
void findPairs(int target)
Logic: Check all pairs (i, j) where arr[i] + arr[j] == target.
*/

import java.util.*;
class ArrayPairSum
{
	int a[];
	
	void inputArray(int arr[])
	{
		a=arr;
	}
	void findPairs(int target)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.printf("[%d,%d]",i,j);
					
				}
			}
		}
		
	}
}
public class TargetSumAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array ELement");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Target");
		int target = sc.nextInt();
		ArrayPairSum a1 = new ArrayPairSum();
		a1.inputArray(arr);
		a1.findPairs(target);
		
		
	}
}