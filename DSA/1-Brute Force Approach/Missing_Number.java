/*
5. Find Missing Number in 1 to N
Problem:
Find a missing number from 1 to N in array of N-1 size.
Example:
Input: [1, 2, 4, 5], N = 5  
Output: 3
*/

import java.util.Scanner;
public class Missing_Number
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int N;
		N=sc.nextInt();
		int a[]= new int[N];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//missing element logic
		for(int i=0;i<(a.length-1);i++)
		{
			if((a[i]-a[i+1])!=1)
			{
				while((a[i]+1)<a[i+1])
				{
					System.out.printf("%d\t",++a[i]);
				}
			}
		}
	}
}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
			
		