//7.Write a program to rotate an array by k positions.


import java.util.*;
public class RotaArrK
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter array size");
		n=sc.nextInt();
	    
		int a[] = new int[n];
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter k");
		int k=sc.nextInt();
		k=k%n;
		
		//rotate array k times
		for(int i=0;i<k;i++)
		{
			int last=a[n-1]; 
			for(int j=n-1;j>0;j--) 
			{
				a[j]=a[j-1];  // 
			}
			a[0]=last;  //5 1 2 3 4
		}
		
		System.out.println("after rotate array");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}