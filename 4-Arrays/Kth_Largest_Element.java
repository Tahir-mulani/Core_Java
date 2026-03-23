/*
Write a Java program to find the kth largest element in an array without sorting.
Input:
Enter size: 6
Enter elements: 10 45 23 67 34 67
Enter k value: 2
Output: Second largest element is 45
*/
import java.util.*;
public class Kth_Largest_Element
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();   //size of array
		
		int arr[] = new int[n];  //array declaration 
		
		System.out.println("enter array element");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt(); //add element in array
		} 
		
		System.out.println("Enter Kth Value");
		int k = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		
		//calculate max
		for(int i=0;i<n;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];  
			}
		}
		int smax = Integer.MIN_VALUE;
		
		//caluculate smax
		for(int i=1;i<k;i++)
		{
			smax = Integer.MIN_VALUE;   
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j] > smax && arr[j] < max)   //compare with max && smax
				{
					smax = arr[i];
				}
			}
			max = smax;  //change the value of max
			
		}
		System.out.println(smax);
	}
}