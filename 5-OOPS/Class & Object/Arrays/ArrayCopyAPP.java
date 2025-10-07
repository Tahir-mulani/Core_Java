/*
Q8.Copy Array Elements into Another Array
Class: ArrayCopy
Functions:
void inputArray(int arr[])
int[] copyArray()
Logic: Loop through source array and store elements into new array.
*/

import java.util.Scanner;
class ArrayCopy
{
	int a[];
	int b[];
	void inputArray(int arr[],int c[])
	{
		a=arr;
		b=c;
		
	}
	int [] copyArray()
	{
		for(int i=0;i<a.length;i++)
		{
			b[i]= a[i];
		}
		return b;
	}
}

public class ArrayCopyAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int arr[] = new int[n];
		int c[]=new int[arr.length];
		System.out.println("Enter Array ELement");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		ArrayCopy a1 = new ArrayCopy();
		a1.inputArray(arr,c);
		int result[] = a1.copyArray();
		System.out.println("After copy array element");
		for(int i=0;i<result.length;i++)
		{
			System.out.printf("%d\t",result[i]);
		}
	}
}
			
