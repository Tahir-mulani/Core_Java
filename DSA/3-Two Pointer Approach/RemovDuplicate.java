/*
5.Remove Duplicates from Sorted Array
Remove duplicates from a sorted array using two pointers and return new length.
*/

import java.util.*;
public class RemovDuplicate
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6]; //{1,2,3,3,2,1}
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//sort array
		Arrays.sort(a);
		
		//Remove duplicates logic
		int i=0;
		for(int j=1;j<a.length;j++)
		{ 
			// find unique element
			if(a[j]!=a[i]) 
			{
				i++;
				a[i]=a[j];
			}
		}
		
		
		//print unique element
		for(int k=0;k<=i;k++)
		{
			System.out.printf("%d\t",a[k]);
		}
	}
}

			
			
		