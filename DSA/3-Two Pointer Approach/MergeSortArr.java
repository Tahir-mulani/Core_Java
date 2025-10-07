/*
4.Merge Two Sorted Arrays (No Extra Space)
Merge two sorted arrays in-place using the two-pointer method.
*/

import java.util.*;
public class MergeSortArr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4]; //[10,20,30,40]
		int b[] = new int[3]; //[1,2,3]
		
		
		//input element in array
		System.out.println("Enter first array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("------------------------------");
		System.out.println("Enter second array element");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("-------------------------------");
				
		//merge array sorted place
	
		int right=a.length-1;
		int left=0;
		int temp;
		while(right>=0 && left<b.length)
		{
				if(a[right]>b[left])
				{
					temp = a[right];
					a[right] = b[left];
					b[left] = temp;
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
	