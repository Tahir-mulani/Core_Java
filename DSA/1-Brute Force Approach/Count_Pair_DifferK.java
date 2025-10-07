/*3. Count All Pairs with Difference k
 Problem:
Find all pairs (i, j) such that |arr[i] - arr[j]| = k.
Example:
Input: arr = [1, 5, 3, 4, 2], k = 2  
Output: (1,3), (5,3), (3,1), (4,2)
*/

import java.util.Scanner;
public class Count_Pair_DifferK
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int k;
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter value of k");
		k=sc.nextInt();
		
		
		//count pairs logic
		
		for(int i=0;i<(a.length-1);i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(((a[i]-a[j])==k)|| ((a[i]-a[j])==-k))
				{
					
					System.out.printf("(%d,%d)",a[i],a[j]);
				}
				
			}
		}
		
	}
}
		
		
		