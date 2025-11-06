//9. Merge Two Arrays

import java.util.*;
public class MergeAPP
{	
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of two arrays");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int a1[] = new int[n1];
		int a2[] = new int[n2];
		System.out.println("Enter first Array element");
		for(int i=0;i<n1;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter second Array element");
		for(int i=0;i<n2;i++)
		{
			a2[i]=sc.nextInt();
		}
		/*
		//without using third array.
		System.out.println("Merged Array");
		for(int i=0;i<n1;i++)
		{
			System.out.printf("%d ",a1[i]);
		}
		for(int i=0;i<n2;i++)
		{
			System.out.printf("%d ",a2[i]);
		}	
	
		*/
		
		//with using third array.
		int a3[]=new int[n1+n2];
		//merge logic
		for(int i=0;i<n1;i++)
		{
			a3[i]=a1[i];
		}
		for(int i=0;i<n2;i++)
		{
			a3[n1+i]=a2[i];
		}
		
		System.out.println("Merged Array");
		for(int i=0;i<a3.length;i++)
		{
			System.out.printf("%d ",a3[i]);
		}		
	
	}
}