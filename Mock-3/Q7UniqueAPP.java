/*
Q7. Write a java program to find the unique value from array.
Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10
All unique elements in the array are: 3, 20, 12, 10
*/

import java.util.Scanner;
public class Q7UniqueAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n =sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Unique elements are: ");
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==1)                  //Appers only one
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}