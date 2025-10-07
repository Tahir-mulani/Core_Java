/*
3.Count Pairs with Given Sum
Count how many pairs in an unsorted array sum up to a target using two pointers.
*/
import java.util.*;
public class CountPairSum
{
	public  static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]= new int[5]; 
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//input target
		System.out.println("enter target");
		int t=sc.nextInt(); 

		//sort the array
		Arrays.sort(a);
		
		
		//declare two pointers
		int left=0,right=(a.length-1);
		int count=0;
		
		while(left<right)
		{
			int sum=a[left]+a[right];
			if(sum==t)
			{
				System.out.printf("(%d,%d)",a[left],a[right]);
				right--;
				left++;
			}
			else if(sum<t)
			{
				left++;
			}
			else
			{
				right--;
			}
		}	
	}
}
