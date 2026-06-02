/*4. To Lower Case (LC 709)
Given a string containing uppercase letters, convert all 
characters into lowercase and return the modified string. 
Example: Input: "HELLO" → Output: "hello"*/
import java.util.Scanner;
public class ToLowerCaseLC709
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		String result = toLowerCase(str);
		System.out.println(result);
	}
	public static String toLowerCase(String str)
	{
		StringBuilder s = new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char ch = (char)(str.charAt(i)+32);
			s.append(ch);
		}
		return s.toString();
			
	}
}