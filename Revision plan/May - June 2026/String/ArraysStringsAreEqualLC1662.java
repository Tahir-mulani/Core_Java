/*9. Check if Two String Arrays are Equivalent (LC 1662 Inspired)
Given two strings, compare them character by character 
and determine whether they are equal. Return true 
if both strings are identical; otherwise, return false.
Example: Input: "abc", "abc" → Output: true*/
import java.util.*;
public class ArraysStringsAreEqualLC1662
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = sc.nextLine();
		System.out.println("Enter second String");
		String s2 = sc.nextLine();
		boolean result = checkStringEqual(s1,s2);
		System.out.println(result);
	}
	public static boolean checkStringEqual(String s1,String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		 
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) != s2.charAt(i))
			{
				return  false;
			}
		}
		return true;
		
	}
}