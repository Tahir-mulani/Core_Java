/*
6.Find All Pairs with Given Sum
Concept: Use nested loops or two-pointer technique to check sums.
 Use Case: Match contributors, tasks, etc., that add up to a budget.
arr = [1, 5, 7, -1, 5]
Target sum (S) = 6
Example: Pairs with sum 6:
(5, 1)
(-1, 7)
(5, 1)
*/

import java.util.Scanner;
class AllPairsSumArray
{
	int []a;
	int target;
	AllPairsSumArray(int a[],int target)
	{
		this.a=a;
		this.target=target;
	}
	public void pairsum()
	{
		System.out.println("pairs with sum" +target);
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.printf("\n(%d,%d)",a[i],a[j]);
				}
			}
		}
	}
}
public class AllPairsSumArrayAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array length");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter Array Element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Target Sum");
		int target = sc.nextInt();
		AllPairsSumArray m = new AllPairsSumArray(a,target);
		m.pairsum();
		
		
	}
}
		