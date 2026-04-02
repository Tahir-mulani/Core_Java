//Write a Java program to print all elements from an integer array that are greater than a given number.
import java.util.*;
public class Display_Greater_ValAPP
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
		System.out.println("Enter elements");
		int val = sc.nextInt();
		boolean flag = false;
		for(int i=0;i<n;i++)
		{
			if(arr[i] > val){
				System.out.print(arr[i]+" ");
				flag = true;
			}
			
		}
		if(flag){
			System.out.println("Elements are greater than "+val);
		}
		else
		{
			System.out.println("Elements are not  greater than "+val+" present in given array");
		}			
		
	}
}