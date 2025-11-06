/*Move All Zeros to End
Approach: Two Pointers
Example: arr = [0,1,0,3,12] → [1,3,12,0,0]
*/

public class ZerosToEndAPP
{
	public static void main(String x[])
	{
		int arr[] ={0,1,0,3,12};
		int j=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				j++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.printf("%d ",arr[i]);
		}
	}
}
			