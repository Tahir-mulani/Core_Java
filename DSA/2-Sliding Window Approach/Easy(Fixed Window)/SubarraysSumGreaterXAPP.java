//Count Subarrays of Size K with Sum > X
public class SubarraysSumGreaterXAPP
{
	public static void main(String args[])
	{
		int arr[] ={2, 3, 5, 1, 4};
		int sum=0;
		int x=10;
		int k=3;
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		if(sum>k)
		{
			count++;
		}
		
		for(int i=k;i<arr.length-1;i++)
		{
			sum=sum+arr[i]-arr[i-k];
			if(sum>k)
			{
				count++;
			}
		}
		System.out.print("Given Array : ");
		for(int val: arr)
		{
			System.out.print(val+" ");
		}
		System.out.print("\nSubarrays of Size " +k+ " with Sum > " +x+ " is : "+count);
	}
}
		