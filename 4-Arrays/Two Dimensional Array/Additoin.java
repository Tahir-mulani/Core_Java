/*Q1. WAP to create two matrix of 3 x 3  and calculate addition of two matrix 
and store in third matrix.
*/

import java.util.*;
public class Additoin
{
	public static void main(String x[])
	{
		Scanner sc  = new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		
		System.out.println("Enter array Element");
		//enter first mattrix
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.printf("=============================\n");
		//enter second mattrix
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.printf("=============================\n");
		//calculate sum
		for(int i=0;i<a.length;i++)
		{	int sum=0;	
			for(int j=0;j<a[i].length;j++)
			{
				sum=b[i][j]+a[i][j];  
				c[i][j]=sum;
			}
			
		}
		
		//print sum mattrix.
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d\t",c[i][j]);
			}
			System.out.printf("\n");
		}
		
	}
}