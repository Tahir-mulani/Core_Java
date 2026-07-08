//replace space with hypens
import java.util.Scanner;
public class ReplaceSpace
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		String result = "";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(str.charAt(i) == ' '){
				result += '-';
				continue;
			}
			result += ch;
		}
		System.out.println("Before "+str);
		System.out.println("After "+result);
		
	}
}