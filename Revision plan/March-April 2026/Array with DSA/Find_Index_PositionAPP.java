/*Given an integer array and a specific element,
write a Java program to find the index position of 
that element in the array.
If the element is not found, print -1. */
import java.util.*;
public class  Find_Index_PositionAPP
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
				
		System.out.println("Enter target Element");
		int target = sc.nextInt(); //target element
		 
		int result = findIndexOf(arr,target); //check the index of element
		
		if(result != -1)
		{
			System.out.println("Element "+target+" found at index "+result);
		} 
		else
		{
			System.out.println("Element "+target+" is not found");
		}			
	}
	public static int findIndexOf(int arr[],int target)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == target)          //checking index of target element
			{
				return i;
			}
		}
		
		return -1;
	}
				
		
}