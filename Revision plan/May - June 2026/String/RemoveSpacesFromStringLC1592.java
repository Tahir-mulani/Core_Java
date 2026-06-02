/*8. Remove Spaces from String (LC 1592 Inspired)
Given a string containing spaces, remove all spaces and 
return the updated string without changing the order of 
remaining characters. Example: Input: "a b c d" → Output: "abcd"*/
import java.util.*;
public  class RemoveSpacesFromStringLC1592
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		String result =  removeSpaces(str);
		System.out.println(result);
		
	}
	public static String removeSpaces(String str)
	{
		StringBuilder s = new StringBuilder();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ' ')
			{
				continue;
			}
			s.append(str.charAt(i));
		}
		return s.toString();
	}
}