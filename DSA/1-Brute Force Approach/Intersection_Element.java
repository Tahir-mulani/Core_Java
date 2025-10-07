/*
7. Find Intersection of Two Arrays
 Problem:
Print common elements in two arrays using brute force.
Example:
Input: arr1 = [1, 2, 3], arr2 = [2, 3, 4]  
Output: 2, 3
*/

import java.util.Scanner;
public class Intersection_Element
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("limit:");
		int n=sc.nextInt();
		System.out.println("enter frist array element:");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("enter second array element:");
		int b[]=new int[n];
		for(int i=0;i<b.length;i++){
			b[i]=sc.nextInt();
		}
		
		//intersection logic 
		boolean flag=true;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					flag=false;
					System.out.printf("%d\t",a[i]);
				}
			}
		}
		if(flag)
		{
			System.out.println("There is no common element");
		}				
	}
}
		
			
		