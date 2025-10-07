//Q.10
import java.util.*;
public class Check_Character
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  char ch;
  System.out.println("enter character");
  ch=sc.nextLine().charAt(0);
  if(ch>='a'&& ch<='z' || ch>='A'&&ch<='Z')
  {
   System.out.println("This is alphabetic character");
   }
    else if(ch>='0'&&ch<='9')
   {
    System.out.println("This is digit");
	}
	else
	{
	 System.out.println("This is Special character");
	 }
 }
}