//8.Write a program to find the duplicate elements in an array.

import java.util.*;
public class DupliArr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter array size\n");
		int n=sc.nextInt();
		
		int a[] = new int[n];
		System.out.printf("enter array element\n");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//sort array
		Arrays.sort(a);
		
		//find duplicate element logic.		
		int count=1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
			}
			else
			{
				if(count>1)
				{
					System.out.printf("%d\t",a[i]);
				}
				count=1;
			}
		}
		if(count>1)
		{
			System.out.printf("%d",a[a.length-1]);
		}
	}
}