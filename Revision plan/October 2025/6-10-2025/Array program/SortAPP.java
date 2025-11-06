//7. Sort an Array (Ascending Order)

import java.util.*;
public class SortAPP
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array Size");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array Element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\nDisplay Array before Sorting");
		for(int i=0;i<n;i++)
		{
			System.out.printf("%d  ",a[i]);
		}
		
		//apply Selection sort logic.
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println("\nDisplay Array after Sorting");
		for(int i=0;i<n;i++)
		{
			System.out.printf("%d  ",a[i]);
		}
			
	}
}