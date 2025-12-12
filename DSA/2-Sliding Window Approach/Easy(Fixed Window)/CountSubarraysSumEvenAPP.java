//2.Count subarrays of size K where sum is even
public class CountSubarraysSumEvenAPP
{
	public static void main(String x[])
	{
		int arr[]={2,1,5,1,3,2};
		int k=3;
		int sum=0;
		int count=0;
		for(int i=0;i<k;i++)
		{
			sum=sum+arr[i];
		}
		if(sum%2==0)
			{
				count++;  
			}
		
		for(int i=k;i<arr.length;i++)
		{
			sum=sum+arr[i]-arr[i-k];
			if(sum%2==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}