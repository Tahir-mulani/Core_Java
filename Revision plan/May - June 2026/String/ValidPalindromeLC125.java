/*2. Valid Palindrome (LC 125)
Given a string, determine whether it reads the same forward and 
backward after ignoring spaces, punctuation, and case differences. 
Return true if the string is a palindrome; otherwise, return false. 
Example: Input: "madam" → Output: true*/
import java.util.Scanner;
public class ValidPalindromeLC125
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		if(isPalindrome(str))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not Palindrome");
		}
	}
	public static boolean isPalindrome(String str)
	{
		if(str.charAt(0) != str.charAt(str.length()-1))
		{
			return false;
		}
		else
		{
			boolean flag = false;
			String rev = getReverseString(str);
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i) == rev.charAt(i))
				{
					flag = true;
				}
			}
			return flag;
					
		}
	}
	public static String getReverseString(String str)
	{
		StringBuilder s = new StringBuilder();
		
		int right = str.length()-1;
		while(right>=0)
		{
			s.append(str.charAt(right));
			right--;
		}
		return s.toString();
	}
}