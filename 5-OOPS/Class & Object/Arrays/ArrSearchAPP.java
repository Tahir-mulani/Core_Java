/*
Q4. Search an Element in Array
Class: ArraySearch
Functions:
void inputArray(int arr[])
boolean searchElement(int key)
Logic: Traverse array, check if key matches any element.
*/

import java.util.Scanner;
class searchElement
{
	int m[];
	int target;
	void inputArray(int a[],int key)
	{
		m=a;
		target=key;
	}
	boolean searchElement()
	{
		for(int i=0;i<m.length;i++)
		{
			if(m[i]==target)
			{
				
				return true;
			}
		}
		return false;
		
	}
}

public class ArrSearchAPP
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
		System.out.println("Enter Array key");
		int key=sc.nextInt();
		
		
		searchElement m1= new searchElement();
		m1.inputArray(a,key);
		boolean ans= m1.searchElement();
		if(ans)
		{
			System.out.println("element is present in array");
		}
		else
		{
			System.out.println("element is not present in array");
		}
		
	}
}
