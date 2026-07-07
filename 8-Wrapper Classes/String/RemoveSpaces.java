//Remove spaces from string
import java.util.Scanner;
public class RemoveSpaces
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String");
		String s = sc.nextLine();
		StringBuilder str = new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch != ' ')
			{
				str.append(ch);
			}
		}
		
		System.out.println(str);
		
				
		
	}
}