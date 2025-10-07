//11.input character and print a to Z.
import java.util.*;
public class Practice
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  char ch;
  System.out.println("enter character");
  ch=sc.nextLine().charAt(0);
  
  while(ch>'a' && ch<'z')
  {
   System.out.printf("%c\t",ch);
   System.out.println((char)(ch-32));
   ch++;
  }
 }
}