/*
Longest Substring Without Repeating Characters
Return the length of the longest substring with all unique characters.
*/
import java.util.*;
public class LongestSubstringAPP
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str  = sc.nextLine();
		
		Map<Character,Integer> map = new HashMap<>();
		int left=0;
		int maxlength=0;
		
		for(int right =0;right<str.length();right++)
		{
			char ch = str.charAt(right);
			
			//if character  already exits ,move left pointer
			if(map.containsKey(ch))
			{
				left = Math.max(left,map.get(ch)+1);
			}
			
			map.put(ch,right);
			maxlength = Math.max(maxlength,right-left+1);
		}
		System.out.println("Longest Substring length: "+maxlength);
	}
}
	