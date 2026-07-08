//find frequency of each characters
import java.util.Scanner;
public class FrequencyEachCharacter
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String");
		String str = sc.nextLine();
		boolean flag[] = new boolean[str.length()];
		for(int i=0;i<str.length();i++)
		{
			int count = 1;
			char ch = str.charAt(i);
			if(flag[i])
			{
				continue;
			}
			for(int j=i+1;j<str.length();j++)
			{
				if(ch == str.charAt(j))
				{
					count++;
					flag[j] = true;
				}			
			}
			System.out.println(ch+" --- "+count);
		}		
	}
}