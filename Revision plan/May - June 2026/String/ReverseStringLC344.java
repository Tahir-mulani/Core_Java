/*1. Reverse a String (LC 344)
Given a string, write a program to reverse the sequence of characters and 
return the reversed string. The solution should handle all characters correctly 
while maintaining the original character values. Example: Input: "hello" → Output: "olleh"*/
import java.util.Scanner;
public class ReverseStringLC344
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		System.out.println("Before reverse ="+str);
		System.out.println("After reverse ="+getReverseString(str));
		

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