/*write a java program to find maximum product of two integers in a given array of integers.
example:
	input:
	nums ={2,3,5,7,-7,5,8,-5}
	output:
	pair is (7,8),Maximum Product:56 */

import java.util.Scanner;
public class Q5MaxProdAPP
{	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int p=0,q=0;
		int max=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]!=a[j])
				{
					int product=a[i]*a[j];
					if(product>max)
					{
						max=product;
						p=i;
						q=j;
					}
				}
			}
		}
		
		System.out.printf("\nPair is (%d,%d) And Maximum Product is = %d",a[p],a[q],max);		
	}
}
		
	

