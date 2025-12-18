//Find longest subarray with sum ≤ K
public class LongestSubArrSumAPP
{
	public static void main(String x[])
	{
		int arr[]={2,3,5,1,4};
		int start=0;
		int k=6;
		int end=0;
		int sum=0;
		int maxlength=0;
		
		while(end<arr.length)
		{
				sum+=arr[end];
				
				while(sum >= k)
				{
					sum=sum-arr[start];
					start++;
				}
			int currentLength = end-start+1;
			
			if(currentLength > maxlength)
			{
				maxlength = currentLength;
			}
			end  = end + 1;
		}
		System.out.println(maxlength);
	}
}


