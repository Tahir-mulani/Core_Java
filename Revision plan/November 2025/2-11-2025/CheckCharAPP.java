//3.Write program to character from keyboard and check character is alphabet digit or special symbols?
import java.util.Scanner;
public class CheckCharAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char ch =sc.next().charAt(0);
		String str=(ch>='0' && ch<='9')? "Numeric":(ch>'A' && ch<'z')? "Alphabet":"Special Symbol";
		System.out.println("character is "+str);
		
	}
}