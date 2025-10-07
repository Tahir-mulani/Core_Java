/*
Q10. Count Frequency of Each Element
Class: ArrayFrequency
Functions:
void inputArray(int arr[])
void countFrequency()
Logic: For each element, count how many times it appears using nested loop.
*/

import java.util.*;
class ArrayFrequency
{
	int a[];
	void inputArray(int arr[])
	{
		a=arr;
	}
	void countFrequency()
	{
		boolean visited[]= new boolean [a.length];
		for(int i=0;i<a.length;i++)
		{
			if(visited[i])
			{
				continue;
			}
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					visited[j]=true;
				}
			}
			System.out.printf("\n%d ----->%d",a[i],count);
		}
	}
}
public class ArrayFrequencyAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter Array Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayFrequency a1 = new ArrayFrequency();
		a1.inputArray(arr);
		a1.countFrequency();
	}
}