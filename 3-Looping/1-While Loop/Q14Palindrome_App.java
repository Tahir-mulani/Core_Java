//Q14. Write a java program to check whether a number is palindrome or not.
import java.util.*;
public class Q14Palindrome_App
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i=1,rev=0,d,temp;
  System.out.println("enter number");
  n=sc.nextInt();//153
  temp=n;
  while(n!=0)
  { 
    d=n%10;//3
	n=n/10;//15
	
	rev=rev*10+d;
	i++;
  }
  if(rev==temp)
  {
	System.out.println("number is palindrome");
  }
  else
  {
	 System.out.println("number is not palindrome");
  }
 }
}