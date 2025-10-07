//4. Search for an Element in an Array

import java.util.*;
public class SearchEleAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter search Element");
		int skey = sc.nextInt();
		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==skey)
			{
				flag= true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
		
	}
}



