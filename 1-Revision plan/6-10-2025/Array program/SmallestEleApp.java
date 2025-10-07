//2. Find the Smallest Element in an Array

import java.util.*;
public class SmallestEleApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] =new int[n];
		System.out.println("Enter array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int smallest = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println("Smallest element in the array is: "+smallest);
		
	}
}
		