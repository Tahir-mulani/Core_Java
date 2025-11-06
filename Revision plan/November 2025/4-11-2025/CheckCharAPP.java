/*
Q2. Write program to create class name as CheckChar with two functions
        void setChar(char ch): this function accept single character as input
      boolean checkChar(): this function can check character is alphabet or digit of special     symbol if
     character is alphabet or digit return true if character is digit then return false.
*/
import java.util.Scanner;
class CheckChar
{
	char ch;
	public void setChar(char ch)
	{
		this.ch=ch;
	}
	public boolean checkChar()
	{
		
		if((ch<='9' && ch>='0') ||(ch<='z' && ch>='A'))
		{
			return true;
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
		System.out.println("Enter character");
		char ch = sc.next().charAt(0);
		CheckChar c1 = new CheckChar();
		c1.setChar(ch);
		System.out.println(c1.checkChar());
	}
}
		