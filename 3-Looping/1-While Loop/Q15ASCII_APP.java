//Q15. Write a java program to print all ASCII characters with their values.
import java.util.*;
public class Q15ASCII_APP
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  char ch;
  System.out.println("enter character from keyboard");
  ch=sc.nextLine().charAt(0);
  while(ch<='z')
  {
   System.out.println(ch+""+(int)ch);
  
   ch++;
  }
 }
}

