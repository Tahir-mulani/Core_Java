//4.Find number of subarrays of size K where average > X
public class SubarrayAvgTargetAPP
{
	public static void main(String args[])
	{
		int arr[] ={2, 3, 5, 1, 4};
		int sum=0;
		int x=3;
		int k=3;
		int count=0;
		for(int i=0;i<k;i++)
		{
			sum=sum+arr[i];
		}
	 
		if(sum > (x*k))
		{
			count++;
		}
		
		for(int i=k;i<arr.length;i++)
		{
			sum= sum + arr[i] - arr[i-k];
			
			if(sum > (x*k))
			{
				count++;
			}
		}
		System.out.print("Given Array : ");
		for(int val: arr)
		{
			System.out.print(val+" ");
		}
		System.out.print("\nSubarrays of Size " +k+ " with Average > " +x+ " is : "+count);
		
	}
}
		
