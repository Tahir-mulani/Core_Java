//Smallest subarray with sum ≥ K
public class SmallestSubArrSum
{
	public static void main(String x[])
	{
		int arr[]={2,3,5,1,4};
		int sum=0;
		int start=0;
		int end=0;
		int k=6;
		int minlength=arr.length+1;
		while(end<arr.length)
		{
			sum=sum+arr[end];
			 
			 while(sum >=k)
			 {
				 int currenLength = end-start+1;
				 
				 if(currenLength < minlength)
				 {
					 minlength=currenLength;
				 }
				 sum=sum-arr[start];
				 start++;
			 }
			 end++;
		}
		if(minlength == arr.length + 1)
		{
			System.out.println("No subarray found");
		}
		else
		{
			System.out.println("Smallest subarray length = "+minlength);
		}
	}
}
			