//Longest Substring Without Repeatating Characters
import java.util.*;
public class Longest_substring_Without_RepeatatingAPP
{
	public static void main(String[] args) {
         String s = " ";
         int result = lengthOfLongestSubstring(s);
         System.out.println(result);
    }
	public static int lengthOfLongestSubstring(String s)
	{
		int arr[] = new int[26];
        
        int currenLength = 0;
        int maxLength = 0;
    
        for(int i=0;i<s.length();i++)
		{
			int index = (int)(s.charAt(i) - 'a');
			if(arr[index] == 1)
			{
				if(currenLength > maxLength)
				{
					maxLength = currenLength;
					
				}
				currenLength--;
				arr[i] = 0;
			}
			else
			{
				arr[index] = 1;
				currenLength++;
			}
		}
		return maxLength;
	}
}