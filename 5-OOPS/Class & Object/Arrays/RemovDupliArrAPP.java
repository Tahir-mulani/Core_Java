/*
Q13. Remove Duplicate Elements from Array
Class: ArrayRemoveDuplicate
Functions:
void inputArray(int arr[])
int[] removeDuplicate()
Logic: Use nested loop, copy only unique elements to new array.
*/

import java.util.*;
class ArrayRemoveDuplicate
{
	int a[];
	
	void inputArray(int arr[])
	{
		a=arr;
	}
	int [] removeDuplicate()
	{
		Arrays.sort(a);
		int count=1;
		for(int i=1;i<a.length;i++)
		{
			if(a[i-1]!=a[i])
			{
				count++;
			}
		}
		int b[]=new int[count];
		b[0]=a[0];
		int j=1;
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]!=a[i-1])
			{
				b[j]=a[i];
				j++;
			}
		}
		
		return b;
	}
	
}
public class RemovDupliArrAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Array size");
		int n= sc.nextInt();
		int arr[] = new int [n];
		ArrayRemoveDuplicate dp = new ArrayRemoveDuplicate();
		System .out.println("Enter Array Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		dp.inputArray(arr);
		
		int result[]=dp.removeDuplicate();
		
		for(int p:result)
		{
			System.out.printf("%d\t",p);
		}
	}
}