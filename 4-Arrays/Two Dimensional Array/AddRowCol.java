//Q1. WAP to create two matrix of 3 x 3  and calculate addition of Rows and coloumn.

import java.util.*;
public class AddRowCol
{
	public static void main(String x[])
	{
		Scanner sc  = new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[]=new int [3]; //for row
		int c[]=new int [3]; //for coloumn
		
		System.out.println("Enter array Element");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		//calculate Row sum
		for(int i=0;i<a.length;i++)
		{	int sum=0;	
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];  
				b[i]=sum;
			}
			
		}
		
		//calculate coloumn sum
		for(int i=0;i<a.length;i++)
		{	int sum=0;	
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[j][i];
				c[j]=sum;
			}	
		}
		
		//print the row sum.
		System.out.println(Arrays.toString(b));
		
		//print the coloumn sum.
		System.out.println(Arrays.toString(c));
	}
}