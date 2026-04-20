/*
Q1. Write a Java program to find the second largest distinct element in an integer array. If the second largest distinct element does not exist, print -1.
Description :-The array may contain duplicate values. You must consider only distinct numbers.
Input :-
•
First line contains integer n
•
Second line contains n space-separated integers
Output :- Print the second largest distinct element.
Input - 7 3 9 9 5 7
Output - 7
Explanation :-
Distinct elements = {3,5,7,9} Second largest = 7*/

import java.util.Scanner;
public class Second_Largest_DistinctAPP
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
		
		int result = getSecLargestDistinctElement(arr);
		System.out.println(result);
		
	}
	public static int getSecLargestDistinctElement(int arr[])
	{
		int n = arr.length;
		int j=0;
		
		for(int i=1;i<n;i++)
		{
			if(arr[i] != arr[j])
			{
				j++;
				arr[i] = arr[j];
			}
		}
		
		int max = 0,smax = 0;
		for(int i=0;i<j;i++)
		{
			if(arr[i] > max)
			{
				smax = max;
				max= arr[i];
			}
			else if(arr[i] > smax && arr[i] != max)
			{
				smax = arr[i];
			}
			else
			{
			}
		}
		return smax;
	}
}