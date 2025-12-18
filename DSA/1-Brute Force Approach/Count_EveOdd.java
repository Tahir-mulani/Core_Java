/*
6. Count Number of Even and Odd Elements
 Problem:
Count how many even and odd elements are present.
Example:
Input: [1, 2, 3, 4, 5, 6]  
Output: Even: 3, Odd: 3
*/

import java.util.Scanner;
public class Count_EveOdd
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		//count even odd logic
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		
		System.out.printf("\nEven=%d\n",count);
		int oddcount=(a.length-count);
		System.out.printf("\nOdd=%d",oddcount);
	}
}
				
			
		