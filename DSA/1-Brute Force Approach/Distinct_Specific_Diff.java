/*
Q9. Write a program in java to count all distinct pairs for a specific difference
Expected Output:
 The given array is:
 5 2 3 7 6 4 9 8
 The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4]
 Number of distinct pairs for difference 5 are: 3
*/

import java.util.Scanner;
public class Distinct_Specific_Diff
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter limit");
		n = sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter Array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//distinct pairs specific difference logic
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if((a[i]-a[j])==5)
				{
					count++;
					System.out.printf("(%d,%d)",a[i],a[j]);
				}
			}
		}
		System.out.printf("Number of distinct pairs for difference 5 are:%d",count);
	}
}
		
		
		