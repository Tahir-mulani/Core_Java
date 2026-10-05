/*Write a Java program to find the kth highest element from an integer array without 
sorting the array. The program must be implemented using Class, Object, and Functions.
Class Name :- KthHighest
Function Name :- findKthHighest(int[] arr, int k)
Input :- Array: {12, 5, 7, 20, 3, 15} k = 3
Output :- 3rd highest element = 12*/
import java.util.*;
class KthHighest
{
	public int findKthHighest(int[] arr,int k)
	{
		int n = arr.length;
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
					smax = arr[j];
				}
			}
			max = smax;  //change the value of max
			
		}
		return smax;
	}
}
public class KthHighestApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = sc.nextInt();
		
		System.out.println("Enter value of K");
		int k = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter array Element");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		KthHighest kth = new KthHighest();
		int result = kth.findKthHighest(arr,k);
		System.out.println(k+" Highest Element is : "+result);
	}
}