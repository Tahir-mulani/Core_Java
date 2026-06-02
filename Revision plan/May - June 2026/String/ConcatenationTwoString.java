/*10. Concatenate Two Strings (No LeetCode)
Given two strings, combine them into a single string 
and return the result. The original order of characters 
must remain unchanged. 
Example: Input: "Hello", "World" → Output: "HelloWorld"*/
import java.util.*;
public class ConcatenationTwoString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = sc.nextLine();
		System.out.println("Enter second String");
		String s2 = sc.nextLine();
		String result = concatenationTwoString(s1,s2);
		System.out.println(result);
	}
	public static String concatenationTwoString(String s1,String s2)
	{
		String result = "";
		for(int i=0;i<s1.length();i++)
		{
			result += s1.charAt(i);
		}
		for(int i=0;i<s2.length();i++)
		{
			result += s2.charAt(i);
		}
		return result;		
	}
	
}