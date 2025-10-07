// Write program to create array of size 5 and reverse it

import java.util.*;
public class ArrReverseAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n =sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int start=0;
		int end = n-1;
		
		while(start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(a));
	}
}
		