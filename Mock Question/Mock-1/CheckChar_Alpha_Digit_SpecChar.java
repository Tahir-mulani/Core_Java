import java.util.Scanner;
public class CheckChar_Alpha_Digit_SpecChar
{
	
	public static void main(String x[])
	{
		//for input character from user
		Scanner sc = new Scanner(System.in);
		int ch;
		
		System.out.println("Enter Character from keyboard");
		ch=sc.next().charAt(0);
		
		//using elseif ladder
		if(ch>='A'&& ch<='z')
		{
			System.out.println("Character is Alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("Character is Digit");
		}
		else
		{
			System.out.println("Character is Special Character");
		}
	}
}