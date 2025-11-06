/*
1. Average of Elements
Concept: First compute the sum, then divide by the number of elements.
 arr = [10, 20, 30, 40, 50]
Average of array elements: 30.0
*/
public class AverageAPP
{
	public static void main(String x[])
	{
		int arr[] = {10, 20, 30, 40, 50};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		double Average=sum/(arr.length);
		System.out.println("Average of array elements: "+Average);
		
	}
}