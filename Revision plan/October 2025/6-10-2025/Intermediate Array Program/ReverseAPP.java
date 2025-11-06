/*
Reverse an Array In-place

Approach: Two Pointers from both ends
Example: arr = [1,2,3,4,5] → [5,4,3,2,1]
*/

public class ReverseAPP
{	
	public static void main(String x[])
	{
		int arr[] = {1,2,3,4,5};
		int j=arr.length-1;
		for(int i=0;i<j;i++)
		{		
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;		
		}	
		/*
		int i=0;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
		*/
		for(int val : arr)
		{
			System.out.printf("%d ",val);
		}
	}
}