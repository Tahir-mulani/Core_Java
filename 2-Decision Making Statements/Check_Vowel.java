//Q.9
import java.util.*;
public class Check_Vowel
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  char ch;
  System.out.println("Enter character");
  ch=sc.next().charAt(0);
  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
  {
   System.out.println("alphabet is vowel");
  }	
  else 
  {
   System.out.println("alphabet is not vowel");
   }
   
  }
 }