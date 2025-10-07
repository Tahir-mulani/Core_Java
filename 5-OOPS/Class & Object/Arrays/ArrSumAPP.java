/*
Q2. Calculate Sum of Array Elements
Class: ArraySum
Functions:
void inputArray(int arr[])
int calculateSum()
Logic: Traverse array and add all values to sum.
*/

import java.util.Scanner;
class ArraySum
{
	int m[];
	void inputArray(int a[])
	{
		m=a;
	}
	int calculateSum()
	{
		int sum=0;
		for(int i=0;i<m.length;i++)
		{
			sum+=m[i];
		}
		return sum;
	}
}

public class ArrSumAPP
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
		System.out.println("Sum of array element is "+m1.calculateSum());	
	}
}
