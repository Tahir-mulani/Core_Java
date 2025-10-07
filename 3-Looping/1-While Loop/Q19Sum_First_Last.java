//Q19. Write a java program to find the sum of the first and last digit of a number.
import java.util.*;
public class Q19Sum_First_Last
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner (System.in);
  int n,sum,count=0,p,first,last,temp;
  System.out.println("enter number");
  n=sc.nextInt();
  temp=n;
  while(n!=0)
  {
   count++;
   n=n/10;
  }
  n=temp;
  last=n%10;
  p=(int)Math.pow(10,--count);
  first=n/p;
  sum=first+last;
  System.out.println("sum of first and last digit: "+sum);
 }
}