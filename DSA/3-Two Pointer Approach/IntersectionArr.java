/*Find Intersection of Two Sorted Arrays
Return the intersection of two sorted arrays using two pointers.
*/

import java.util.*;
public class IntersectionArr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		//System.out.println("Enter size of array");
		//n=sc.nextInt();
		int a[] = new int [5];
		int b[] = new int [6];
	
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		} 
	
		
		//intersection logic.
		int i=0,j=0;
		while(i<a.length &&  j<b.length)
		{
			if(a[i]==b[j])
			{
				System.out.printf("%d\t",a[i]);
				i++;
				j++;
			}
			else if(a[i]<b[j])
			{
				i++;
			}
			else
			{
				j++;
			}
		}
	}
}