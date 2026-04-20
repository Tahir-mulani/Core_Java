/*
Q3. Write a Java program to count all triplets (i, j, k) such that:
•i < j < k
•arr[i] + arr[j] + arr[k] < target
Description :-
You need to count total valid combinations of three different indexes.
Input
•First line contains integer n
•Second line contains n integers
•Third line contains integer target
Output :-
Print total count of triplets.
Input - 5 1 3 4 7 target : 12
Output - 4
Explanation
Valid triplets:
•(1,3,4) = 8
•(1,3,5) = 9
•(1,4,5) = 10
•(1,3,7) = 11
Total = 4  */

import java.util.Scanner;
public class Count_All_TripletsAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter array element");
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter target");
		int target = sc.nextInt();
		
		int result = getCountTriplets(arr,target);
		System.out.println(result);
	}
	public static int getCountTriplets(int arr[],int target)
	{
		int n = arr.length;
		int count = 0;
		
		for(int i=1;i<n;i++)
		{
			if(arr[i] > arr[i-1])
			{
				int temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
			}
		}
			
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(i<j && j<k)
					{
						if(arr[i]+arr[j]+arr[k] < target)
						{
							count++;
						}
					}
				}
			}
		}
		return count;
	}
}