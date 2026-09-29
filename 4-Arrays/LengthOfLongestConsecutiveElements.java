/*Write a java program to find the length of the longest consecutive elements
sequence from an unsorted array of integers
sample array = [49,1,3,200,2,4,70,5]
longest consecutive elements sequence is [1, 2, 3, 4, 5]
therefore the program will return its length 5
*/
import java.util.*;
public class LengthOfLongestConsecutiveElements
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Array Element");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		 int count =0,longest=0;
		 HashSet<Integer> set = new HashSet<>();
		 
		 for(int num:arr)
		 {
			 set.add(num);
		 }
		 
		 for(int i:arr)
		 {
			 count=0;
			 while(set.contains(i))
			 {
				 count++;
				 i++;
			 }
			 longest = Math.max(longest,count);
		 }
		 System.out.println(longest);
		 
	}
}