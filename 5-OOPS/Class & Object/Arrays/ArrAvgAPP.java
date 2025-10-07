/*
Q3. Calculate Average of Array Elements
Class: ArrayAverage
Functions:
void inputArray(int arr[])
double findAverage()
Logic: Use sum ÷ total elements.
*/

import java.util.Scanner;
class ArraySum
{
	int m[];
	void inputArray(int a[])
	{
		m=a;
	}
	double findAverage()
	{
		int sum=0;
		for(int i=0;i<m.length;i++)
		{
			sum+=m[i];
		}
		int avg=sum/m.length;
		return avg;
	}
}

public class ArrAvgAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		ArraySum m1= new ArraySum();
		m1.inputArray(a);
		System.out.println("Average of Array element is "+m1.findAverage());	
	}
}
