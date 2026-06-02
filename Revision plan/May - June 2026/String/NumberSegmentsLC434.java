/*7. Number of Segments in a String (LC 434)
Given a sentence, count the total number of words or
segments separated by spaces. Consecutive spaces should 
not be counted as extra words. 
Example: Input: "I love programming" → Output: 3*/
import java.util.*;
public  class NumberSegmentsLC434
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		int result = numberOfSegmentsInString(str);
		System.out.println(result);
	}
	public static int numberOfSegmentsInString(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			
			if((str.charAt(i) != ' ') &&(i ==0 || (str.charAt(i-1) == ' ')))
			{
				count++;
			}
		}
		return count;
	}
}
	