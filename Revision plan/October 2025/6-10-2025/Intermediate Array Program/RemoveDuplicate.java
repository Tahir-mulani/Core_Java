/* Remove Duplicates from Sorted Array
   Approach: Two Pointers (slow/fast)
   Example: arr = [1,1,2,2,3] → [1,2,3]
*/


public class RemoveDuplicate
{
	public static void main(String x[])
	{
		int arr[] = {1,1,2,2,3};		
		int j=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[j]!=arr[i])
			{
				j++; 
				arr[j]=arr[i];				
			}
		}
		
		for(int i=0;i<=j;i++)
		{
			System.out.printf("%d ",arr[i]);
		}
			
	}
}