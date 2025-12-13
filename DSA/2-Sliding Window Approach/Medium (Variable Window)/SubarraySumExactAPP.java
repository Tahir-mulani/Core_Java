//Count subarrays whose sum is exactly K
public class SubarraySumExactAPP
{
	public static void main(String x[])
	{
		int arr[]={2,3,5,1,4};
		int start=0;
		int end=0;
		int sum=0;
		int count=0;
		int k=6;
		while(end < arr.length)
		{
			sum = sum + arr[end];
			
			while(sum > k)
			{
				 
				sum = sum - arr[start];
				start++;
				
			}
			while(sum == k)
			{
				count++;
				sum = sum - arr[start];
				start++;
			}
			end++;
		}
		System.out.println(count);
		
	}
}
		
