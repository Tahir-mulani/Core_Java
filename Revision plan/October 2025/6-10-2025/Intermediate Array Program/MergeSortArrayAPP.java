/*
Merge Two Sorted Arrays (In-place)
Approach: Two Pointers from end
Example: arr1 = [1,3,5,0,0,0], arr2 = [2,4,6] → [1,2,3,4,5,6]
*/
import java.util.*;
public class MergeSortArrayAPP
{
	public static void main(String x[])
	{
		int a[]={1,3,5,0,0,0};
		int b[]={2,4,6};
		int i=a.length-b.length-1; 
		int j=b.length-1;  
		int k=a.length-1;  
		
		while(j>=0)
		{
			if(a[i]>b[j]) 
			{
				a[k]=a[i];
				k--;
				i--;
			}
			else
			{
				a[k]=b[j];
				k--;
				j--;
			}
		}
		for (int val : a)
            System.out.print(val + " ");
	}
}