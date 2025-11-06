/*
Longest Subarray with Sum ≤ K
Approach: Sliding Window
Example: arr = [1,2,1,0,1,1,0], k = 4 → Length: 5
*/

import java.util.*;
public class MaxLength
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {1, 2, 1, 0, 1, 1, 0};
		System.out.println("Enter Sum to Check");
		int target = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int start = 0;
		for(int end=0;end<arr.length;end++){
			sum += arr[end];
			while(sum>target){
				sum -= arr[start];
				start++;
			}
			int cl = end-start+1;
			if(max<cl){
				max = cl;
			}
		}
		System.out.print(max);
	}
}