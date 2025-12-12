//1.Find minimum sum of subarray of size K
public class MinimumSumSubARRAPP
{
	public static void main(String x[])
	{
		int arr[]={2,1,5,1,3,2};
		int k=3;
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum+=arr[i];
		}
		int minimumSum=sum;
		for(int i=k;i<arr.length;i++)
		{
			sum=sum+arr[i]-arr[i-k];
			 
			if(sum<minimumSum)
			{
				minimumSum=sum;
			}
		}
		System.out.println("Minimum"+minimumSum);
		
	}
}
			
		