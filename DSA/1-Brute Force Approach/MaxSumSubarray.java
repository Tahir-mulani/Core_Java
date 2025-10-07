/*1. Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2,1,-3, 4, -1, 2, 1, -5, ,4]  
Output: 6.  (from subarray [4,-1,2,1])
*/

import java.util.Scanner;
public class MaxSumSubarray
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		int a[]= new int[9];
		int k=4;
		System.out.println("Enter array element");
		//enter array element
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		
		}
		int max=Integer.MIN_VALUE;  //int value -2147483648 to 2147483647
		
		//create subarray logic
		for(int i=0;i<(a.length-k);i++)
		{
			int sum=0;
			//find sum of sub array logic
			for(int j=i;j<(i+k);j++)
			{
				sum=sum+a[j];
				}
				System.out.printf("%d\n",sum);
				//compare sum with max logic
				if(sum>max){
				max=sum;
				}
			 }
	   System.out.printf("Max sum of array is %d\n",max);
	}	
}

		