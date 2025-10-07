//Q.6
import java.util.*;
public class Alphabetic_Char
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  char ch;
  System.out.println("Enter a character");
  ch=sc.nextLine().charAt(0);
  if(ch>='a' && ch<='z')
  {
   System.out.println("Enter character is Alphabetic");
   }
   else if(ch>='A' && ch<='Z')
   {
     System.out.println("Enter character is Alphabetic");
	 }
   else
   {
	 System.out.println("Enter character is not Alphabetic");
   }
 }
}
	 