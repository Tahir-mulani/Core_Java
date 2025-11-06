//2.Write a program to reverse an array without using an extra array.

import java.util.*;
public class RevArr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.printf("\narray before reverse\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		System.out.printf("\narray after reverse\n");
		//reverse array logic.
		for(int  i=(a.length-1);i>=0;i--)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}