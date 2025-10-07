//Q5. WAP to create 3 x 3 matrix and find the second max from every column.

import java.util.*;
public class SMaxColumn
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		int a[][]= new int [3][3];
		System.out.println("Enter array Element");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int smax=Integer.MIN_VALUE;
		
		
		for(int i=0;i<a.length;i++)
		{
			int max=a[0][1];
			for(int j=0;j<a[i].length;j++)
			{
				
				if(a[j][i]>max)
				{
					smax=max;
					max=a[j][i];
				}
				else if(a[j][i]>smax && max!=a[j][i])
				{
					smax=a[j][i];	
				}
				else
				{
					
				}
			}
			if(smax != Integer.MIN_VALUE)
			{
			System.out.printf("%d\n",smax);
			}
			else
			{
				System.out.println("there is no scond largest element in this array");
			}
			}
		
		
	}
}

				
				
