//Q9. Write java program to merge two array and display it.

import java.util.Scanner;
public class ArrAppQ9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]= new int[]{1,2,3,4,5};
		int b[]= new int []{6,7,8,9};
		int c[]= new int [a.length + b.length];
		
		
		//display Merge array logic
		int t=0;
		int m=0;
		int i;
		for(i=0;i<c.length;i++)
		{
			if(i<a.length)
			{
				c[i]=a[m];
				m++;
			}else
			{
				c[i]=b[t];
				t++;
			}
		}
		System.out.println("Display Merge Array element");
		for(int j=0;j<c.length;j++)
		{
			System.out.printf("%d\t",c[j]);
		}
	}
}
			
				
			
		