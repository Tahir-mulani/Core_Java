/*
Q3. Calculate Average of Array Elements
Class: ArrayAverage
Functions:
void inputArray(int arr[])
double findAverage()
Logic: Use sum ÷ total elements.
*/
import java.util.Scanner;
class ArrayAverage
{
	int arr[];	
	void inputArray(int a[])
	{
		 arr = a;
	}
	
	public double findAverage()
	{
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		double avg = sum / arr.length;
		return avg;
	}
}
public class ArrayAverageAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n = sc.nextInt();
		
		int a[]= new int[n];
		
		System.out.println("Enter array elements");
		for(int i =0 ;i< n ;i++)
		{
			a[i] = sc.nextInt();
		}
		
		ArrayAverage average = new ArrayAverage();
		
		average.inputArray(a);
		System.out.println("Average of all array elements : "+average.findAverage());
	}
}