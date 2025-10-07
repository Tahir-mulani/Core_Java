//Q.22
import java.util.*;
public class Palindrome
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner (System.in);
  int n;
  System.out.println("enter number");
  n=sc.nextInt();//123
  int rev=(n%10)*100+((n/10)%10)*10+n/100;
  if(rev==n)
  {
   System.out.println("number is Palindrome");
  }
  else
  {
   System.out.println("number is not Palindrome");
  }
 }
}