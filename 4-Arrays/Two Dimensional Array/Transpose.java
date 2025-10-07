//Q3.WAP to create matrix of 3 x 3 and transpose it means convert row to column and column to row

import java.util.*;
public class Transpose
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		int a[][]= new int[3][3];
		int transpose[][]=new int[3][3];
		
		System.out.println("Enter array Element");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		//transpose row to coloumn 
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				transpose[j][i]=a[i][j];
			}
		}
			
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d\t",transpose[i][j]);
			}
			System.out.printf("\n");
		}
	}
}