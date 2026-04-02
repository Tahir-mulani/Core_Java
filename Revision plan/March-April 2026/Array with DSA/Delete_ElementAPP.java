//Write a program in java to delete an element at desired position from an array.
import java.util.*;
public class Delete_ElementAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter Deletion Position");
		int k = sc.nextInt();
		
		//shift left
		for(int i=k;i<n-1;i++)
		{
			arr[i] = arr[i+1];
		}
		
		n--;
		
		//result
		for(int i=0;i<n;i++)
		{
			 
			System.out.print(arr[i]+" ");
		}
		
	}
}