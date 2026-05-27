/*3. Count Vowels and Consonants (No LeetCode)
Given a string, count the total number of vowels and consonants present in it. 
Consider only alphabetic characters while performing the count. 
Example: Input: "apple" → Output: Vowels = 2, Consonants = 3*/
import java.util.Scanner;
public class CountVowelsConsonants
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		int voweCnt = 0,consoCnt = 0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				voweCnt++;
			}
			else
			{
				consoCnt++;
			}
		}
		System.out.println("Vowels = "+voweCnt+"\tConsonants = "+consoCnt);
	}
}