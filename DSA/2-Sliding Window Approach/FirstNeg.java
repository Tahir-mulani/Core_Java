/*
Find First Negative Number in Every Window of Size K
For each window of size k, find the first negative number.
*/

import java.util.*;
public class FirstNeg
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		System.out.println("Enter array element");
		int a[] = new int[n]; //{12, -1, -7, 8, -15, 30, 16, 28}.
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter size k");
		int k=sc.nextInt();
		
		for(int i=0;i<k;i++)
		{
			if(a[i]<0)
			{
				System.out.printf("%d\t",a[i]);
				break;
			}
		}
		for(int i=k-2;i<a.length-k;i++)
		{
			if(a[i]<0)
			{
				System.out.printf("%d\t",a[i]);
				continue;
			}
		}
	}
}
		