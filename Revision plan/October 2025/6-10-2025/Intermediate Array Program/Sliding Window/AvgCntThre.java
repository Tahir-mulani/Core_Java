/*
Count Subarrays of Size K with Avg ≥ Target

Approach: Sliding Window
Example: arr = [2,1,3,4,1,2], k = 3, avg = 2 → Count: 2
*/

import java.util.*;
public class AvgCntThre
{
	public static void main(String args[])
	{
		int k = 3;
		int threeshold = 2;
		int cnt = 0;
		int arr[] = {2,1,3,4,1,2};
		
		int sum = 0;
		int avg = 0;
		for(int i=0;i<k;i++)
		 {
			sum += arr[i];
		}
		avg = sum / k;
		if(avg>=threeshold)
			cnt++;
		
		for(int i=k;i<arr.length;i++)
		{
			sum += arr[i] - arr[i-k];
			avg = sum / k;
			if(avg>=threeshold)
				cnt++;
		}
		System.out.printf("%d",cnt);
	}
}