/*
Q2. Write a Java program to find the smallest positive integer missing from an unsorted array.
Description :-
The array may contain:
•Negative numbers
•Zero
•Duplicate numbers
•Large values
You must return the first missing positive integer.
Input :-
•First line contains integer n
•Second line contains n space-separated integers
Output :-
Print the smallest missing positive integer.
Input :- 3 4 -1 1 2
Output :- 5  */
import java.util.Scanner;
public class Smallest_Positive_MissingAPP
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
		
		int result = getSmallestMissingPostive(arr);
		System.out.println(result);
	}
	public static int getSmallestMissingPostive(int arr[])
	{
		int n = arr.length;
		
		//place each element at its correct position
		for(int i = 0 ; i < n ; i++)
		{
			while(arr[i] > 0 && arr[i] <= n && arr[i] != arr[arr[i] - 1])
			{
				//swap arr[i] with arr[arr[i] - 1]
				int temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
			}
		}
		
		//find first missing positive
		for(int i = 0; i < n; i++)
		{
			if(arr[i]  != i+1)
			{
				return i+1;
			}
		}
		
		//if all position are correct
		return n+1;			
	}	
}
