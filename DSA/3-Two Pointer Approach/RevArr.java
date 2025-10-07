/*Reverse an Array In-Place
Reverse an array using the two-pointer technique.
*/

import java.util.*;
public class RevArr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter array size");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//sort array
		Arrays.sort(a);
		
		//reverse the array
		int j=a.length-1,temp;
		for(int i=0;i<j;i++)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
			
		}
		
		System.out.println(Arrays.toString(a));
	}
}