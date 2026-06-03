/*3. Reverse a String List
Description
Reverse the order of strings in a list.
Example
Input:
["Java", "Python", "Spring"]
Expected Output:
["Spring", "Python", "Java"]*/
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class ReverseOrderString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list size");
		int size = sc.nextInt();
		List<String> list = new ArrayList<>();
		System.out.println("Enter Element in list");
		for(int i=0;i<size;i++)
		{
			list.add(sc.next());
		}
		
		
		List<String> result = getReverseOrderingString(list);
		for(String s: result)
		{
			System.out.print(s+" ");
		}
			
	}
	public static List<String> getReverseOrderingString(List<String> list)
	{
		List<String> result = new ArrayList<>();
		
		for(int i=list.size()-1;i>= 0;i--)
		{
			result.add(list.get(i));
		}
		return result;
	}
}