//Write a program in java to insert an element at desired position from an array
import java.util.*;
public class Insertion_EleAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		int arr[] = new int[n+1];
		
		System.out.println("Enter array Element");
		for(int i=0;i<n;i++)
		{			 
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter Insertion index and element");
		int k = sc.nextInt();
		int value = sc.nextInt();
		
		//shift element 
		for(int i=n;i>k;i--)
		{
			arr[i] = arr[i - 1];
		}
		
		//insert value
		arr[k] = value;
		 
		for(int i=0;i<arr.length;i++)	
		{
			System.out.print(arr[i]+" ");
			
		}
	}
}