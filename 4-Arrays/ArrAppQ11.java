/*Q11. Print array elements at even indices.
Input: arr = [4, 9, 7, 11, 6]
Output: 4 7 6
Explanation: Even indices → 0, 2, 4 → elements 4, 7, 6.
*/

import java.util.Scanner;
public class ArrAppQ11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//display array element
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		System.out.printf("\n----------------------");
		
		//find even indices element logic 
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.printf("%d\t",a[i]);
			}
		}
	}
}
		
		