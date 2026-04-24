/*
Q1. Write a Java program to remove duplicate characters.
Description:Keep only the first occurrence.
Input:Enter string: programming
Output:progamin */
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Remove_Duplicate_Keep_First_OccurrenceAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
	
		String result = removeDuplicateFirstOccurrence(str);
		System.out.println(result);
		/* using HashSet 
		Set<Character> set = new HashSet<>();
		StringBuilder result = new StringBuilder();
		
		for(char ch : str.toCharArray())
		{
			if(!set.contains(ch))
			{
				set.add(ch);
				result.append(ch);
			}
		}
		System.out.println(result);*/
	}
	public static String removeDuplicateFirstOccurrence(String str)
	{
		String s = "";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			 
			//if character not present in s string then add it
			if(s.indexOf(ch) == -1)
			{
				s += ch;
			}
		}		
		return s;
	}
	 
}
		
		 