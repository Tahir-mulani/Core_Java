//Q.24
import java.util.*;
public class Upper_Lower_Case
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner (System.in);
  char ch;
  System.out.println("Enter character");
  ch=sc.nextLine().charAt(0);
  if(ch>=65 && ch<=90)
  {
   System.out.println("Character in Upper case");
  }
  else if(ch>=97 && ch<=122)
  {
   System.out.println("character in Lower case");
  }
  else
  {
   System.out.println("Invalid Character");
  }
 }
}