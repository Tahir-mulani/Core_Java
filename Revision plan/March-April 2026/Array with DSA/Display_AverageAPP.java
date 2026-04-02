/*Write a Java program to calculate the average of all elements 
present in an integer array. */
import java.util.*;
public class Display_AverageAPP
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
		
		int sum = 0;
		for(int i=0;i<n;i++)
		{
			sum += arr[i];
		}
		
		int avg = sum/n;
		System.out.println("Average of All elements is = "+avg);
	}
	
}