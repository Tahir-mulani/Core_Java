/*
Q6. Reverse the Array
Class: ArrayReverse
Functions:
void inputArray(int arr[])
void reverseArray()
*/

import java.util.Scanner;
class ArrayReverse
{
	int b[];
	void inputArray(int arr[])
	{
		b=arr;
	}
	void reverseArray()
	{
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.printf("%d\t",b[i]);
		}
	}
		
}
public class ReverseArrAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		ArrayReverse a1 = new ArrayReverse();
		a1.inputArray(arr);
		System.out.println("Array After Reverse");
		a1.reverseArray();
	}
}
	
		