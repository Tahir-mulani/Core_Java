/*Q3. Write program to create class name as CheckChar with two functions
 void setChar(char ch): this function accept single character as input
 boolean checkChar(): this function can check character is alphabet or digit of special symbol if
character is alphabet or digit return true if character is digit then return false.
*/

import java.util.*;
class checkChar
{
	char c;
	void setChar(char ch)
	{
		c=ch;
	}
	boolean checkChar()
	{
		if(c<='z' && c>='A')
		{
			return true;
		}
		else if(c<='9' && c>='1')
		{
			return false;
		}
		else
		{
			return false;
		}
	}
}
public class CheckCharAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		char ch = sc.next().charAt(0);
		checkChar n = new checkChar();
		n.setChar(ch);
		boolean flag = n.checkChar();
		if(flag)
		{
			System.out.println("Enter Character is Alphabet");
		}		
		else
		{
			System.out.println("Enter character is not Alphabet");
		}
	}
}
