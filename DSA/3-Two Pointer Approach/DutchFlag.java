/*Sort Colors (Dutch National Flag Problem)
Sort an array of 0s, 1s, and 2s using two/three pointers.
*/

import java.util.*;
public class DutchFlag
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {2, 0, 2, 1, 1, 0};
		
		
		int low=0,mid=0,high=5;
		int temp;
		while(mid<=high)
		{
			if(a[mid]==0)
			{
				temp=a[mid];
				a[mid]=a[low];
				a[low]=temp;
				low++;
				mid++;
			}
			else if(a[mid]==1)
			{
				mid++;
			}
			else if(a[mid]==2)
			{
				temp=a[mid];
				a[mid]=a[high];
				a[high]=temp;
				high--;
			}
			else
			{
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
				
				
				
		
			
		
		
		