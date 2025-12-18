//Count Subarrays of Size K with Sum Even
public class EvenSubarraySumAPP
{
	public static void main(String x[])
	{
		int a[]={1,2,3,4,5,2,3};
		int sum=0,count=0;
		int k=3;
		
		for(int i=0;i<k;i++)
		{
			sum=sum+a[i];
		}
		
		if(sum%2==0)
		{
			count++;
		}
		
		for(int i=k;i<a.length;i++)
		{
			sum=sum+a[i]-a[i-k];
			if(sum%2==0)
			{
				count++;
			}
		}
		System.out.print("Given Array : ");
		for(int val: a)
		{
			System.out.print(val+" ");
		}
		
		System.out.print("\nSubarrays of Size " +k+ " with Sum Even : "+count);
	}
}
		