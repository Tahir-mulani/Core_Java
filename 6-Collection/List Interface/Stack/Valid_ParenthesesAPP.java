/*
1. Valid Parentheses
Description: You are given a string containing brackets (), {}, []. You must check whether every opening bracket has a correct closing bracket in the correct order.
Explanation: Use stack logic:
 Push opening brackets
 Pop when matching closing bracket appears
Example: Input → "()[]{}" Output → true
Input → "(]" Output → false*/

import java.util.Stack;
public class Valid_ParenthesesAPP
{
	public static void main(String x[])
	{	
		String str = "({[])";
		Stack<Character> s = new Stack<>();
		for(char ch : str.toCharArray())
		{
			if(ch == '(' || ch == '{' || ch== '[')
			{
				s.push(ch);
			} 
			else
			{
				if(ch == ')' || ch == '}' || ch == ']')
				{
					s.pop();
				}
			}
			
		}
		
		if(s.isEmpty())
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		 
	}
}