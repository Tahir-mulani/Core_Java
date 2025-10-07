//9.Write a program to merge two sorted arrays into a single sorted array.

import java.util.*;
public class MergeArr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		int b[] = new int[3]; 
		System.out.printf("enter array element\n");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		//sort array
		Arrays.sort(a);
		Arrays.sort(b);
		
		//find duplicate element logic.		
		int right=a.length-1;
		int left=0,temp;
		
		while(right>0 && left<a.length-1)
		{
			if(a[right]>b[left])
			{
				temp=a[right];
				a[right]=b[left];
				b[left]=temp;
			}
			right--;
			left++;
		}
		
		
		//display merge array logic
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		Arrays.sort(b);
		for(int i=0;i<b.length;i++)
		{
			System.out.printf("%d\t",b[i]);
		}
		
	}
}