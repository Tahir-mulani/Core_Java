/*6. Find Length Without Built-in Function (No LeetCode)
Given a string, determine its length without using any 
built-in length function. Traverse the string manually 
and count the characters. Example: Input: "coding" → Output: 6*/
import java.util.*;
public class CountCharaters
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		int result = countCharaters(str);
		System.out.println(result);
	}
	public static int countCharaters(String str)
	{
		int count =0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ' ')
			{
				continue;
			}
			count++;
		}
		return count;
		
	}
}