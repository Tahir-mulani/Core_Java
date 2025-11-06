/*
Minimum Size Subarray with Sum ≥ Target

Approach: Sliding Window
Example: arr = [2,3,1,2,4,3], target = 7 → Length: 2 ([4,3])
*/
import java.util.*;
public class MinSubArray{
	public static void main(String args[]){
		int arr[] = {2,3,1,2,4,3};
		int target = 7;
		
		int start = 0;
		int sum = 0;
		int cl = 0;
		int ml = Integer.MAX_VALUE;;
		for(int end=0;end<arr.length;end++){
			sum += arr[end];
			while(sum>=target){
				cl = end - start+1;
				if(ml>cl){
					ml = cl;
				}
				sum -= arr[start];
				start++;
			}
		}
		System.out.print(ml);
	}
}