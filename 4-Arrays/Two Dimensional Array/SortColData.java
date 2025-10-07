//Q2. WAP to create create matrix of 3 x 3 and sort the column data  and display it.

import java.util.*;
public class SortColData
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		int a[][] = new int [3][3];
		
		System.out.println("Enter array Element");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		//Sort Coloumn data logic.
		//using brute force approach.
		for(int i=0;i<a.length;i++)
		{
			int n[]=new int[a.length];   
			
			for(int j=0;j<a[i].length;j++)         //insert value in new array.
			{
				n[j]=a[j][i];
			}
			
			for(int j=0;j<n.length;j++)                 //Sort new array.
			{
				for(int k=j+1;k<n.length;k++)
				{
					if(n[j]>n[k])
					{
						int temp=n[j];
						n[j]=n[k];
						n[k]=temp;
					}		
				}
			}
			
			for(int j=0;j<n.length;j++)       //store in original array.                
			{
				a[j][i] =n[j];
			}				
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d",a[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
		
