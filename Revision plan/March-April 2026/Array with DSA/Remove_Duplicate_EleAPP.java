//Write a java program to remove duplicated values from arrays.
import java.util.*;
public class Remove_Duplicate_EleAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter array Element");
		for(int i=0;i<n;i++)
		{			 
			arr[i] = sc.nextInt();
		}
		//without sorting logic
		
		int j=0;  //first pointer
		for(int i=1;i<n;i++)
		{
			if(arr[i] != arr[i-1])
			{
				j++;
				arr[j] = arr[i];
			}
		}
		
		for(int i=0;i<j;i++)
		{
			System.out.print(arr[i]+" ");
		}
		//with sorting logic
		/*
		Arrays.sort(arr);
		int max = -1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] == arr[i-1])
			{
				arr[i] = max;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != max)
			{
				System.out.print(arr[i]+" ");
			}
		}*/				
	}
}