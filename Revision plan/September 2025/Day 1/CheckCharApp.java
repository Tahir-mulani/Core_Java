//3.Write program to character from keyboard and check character is alphabet digit or special symbols?

import java.util.Scanner;
public class CheckCharApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		char ch; 
		System.out.println("Enter character: ");
		ch=sc.next().charAt(0);
		
		
		if(ch>='A' && ch<='z')
		{
			System.out.println("Character is Alphabet");
		}
		else if(ch>='1' && ch<='9')
		{
			System.out.println("Character is digit");
		}
		else
		{
			System.out.println("Character is special symbols");
		}
	
	}
}