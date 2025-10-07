//Q18. Write a java program to find the first and last digit of a number.
import java.util.*;
public class Q18First_lastDigit
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,first,last,temp,count=0,p;
  System.out.println("enter number");
  n=sc.nextInt();//12534
  temp=n;
  while(n!=0)
  {
   count++;
   n=n/10;
  }
  n=temp;
  last=n%10;//12534%10=4
  //n=n/10;//12534/10=1253
  p=(int)Math.pow(10,--count);
  first=n/p;

  System.out.println("First digit is: "+first);
  System.out.println("last digit is: "+last);
 }
}