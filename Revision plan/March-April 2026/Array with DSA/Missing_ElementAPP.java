//Write a java program to find missing elements in an array.
import java.util.*;
public class Missing_ElementAPP
{
	public static void main(String x[])
	{
		int arr[] = {1,2, 4, 5};
		int max=0;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		
		for(int i=min;i<=max;i++)
		{
			boolean flag = false;
			for(int j=0;j<arr.length;j++)
			{
				
				if(arr[j] == i)
				{
					flag = true;
					break;
				}
			}
			if(!flag)
			{
				System.out.print(i+" ");
			}
		}
	}
}