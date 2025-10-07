/*2. Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4]  
Output: (-1, 0, 1), (-1, -1, 2)
*/

import java.util.Scanner;
public class Triplets_With_ZeroSum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		int a[]=new int[6];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//create subarray
		boolean flag=true;
		for(int i=0 ; i<a.length;i++)
		{ 
			for(int j=i+1;j<(a.length-1);j++)
			{
				for(int k=i+2;k<(a.length-2);k++)
				{
					
					if((a[i]+a[j]+a[k])==0)
					{
						System.out.printf("(%d,%d,%d)",a[i],a[j],a[k]);
						flag=false;
					}
					
					
				}
			}
		}
		if(flag)
		{
			System.out.println("Element not found");
		}
	}
}
	
