/*5. Convert Lowercase to Uppercase (No LeetCode)
Given a string containing lowercase letters, convert all 
characters into uppercase and return the updated string. 
Example: Input: "world" → Output: "WORLD"*/
import java.util.*;
public class ToUpperCase
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		String result = toUpperCase(str);
		System.out.println(result);
	}
	public static String toUpperCase(String str)
	{
		StringBuilder s = new StringBuilder();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = (char)(str.charAt(i)-32);
			s.append(ch);
		}
		return s.toString();
	}
}