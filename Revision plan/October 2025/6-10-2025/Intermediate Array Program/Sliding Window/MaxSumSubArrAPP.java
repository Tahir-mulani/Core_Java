/*
Maximum Sum Subarray of Size K

Approach: Sliding Window
Example: arr = [1,4,2,10,2,3,1,0,20], k = 4 → 24
*/

public class MaxSumSubArrAPP
{
	public static void main(String x[])
	{
		int arr[] = {1,4,2,10,2,3,1,0,20};
		int  k = 4 ;
		int max=Integer.MIN_VALUE;
		int sum=0;
		System.out.print("Window 1: [ ");
		for(int i=0;i<k;i++)
		{
			sum+=arr[i];
			System.out.print(arr[i]+ " ");
		}
		System.out.println("] Sum= "+sum);
		for(int i=k;i<arr.length;i++)
		{
			sum=sum+arr[i]-arr[i-k];
			System.out.print("Window "+(i-k+2)+ " : [");
			for(int j=i-k+1;j<=i;j++)
			{
				System.out.print(arr[j]+ " ");
			}
			System.out.println("] Sum = "+sum);
		}		
	}
}