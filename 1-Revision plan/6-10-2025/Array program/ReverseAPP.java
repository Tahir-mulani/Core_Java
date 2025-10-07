//5. Reverse an Array 

import java.util.*;
public class ReverseAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  array size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array element");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int right =n-1;
		int left=0;
		while(right > left)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			right--;
			left++;
		}
		for(int i=0;i<n;i++)
		{
			System.out.printf("%d ",arr[i]);
		}
			
	}
}
		

		