//Q26. Write a java program to Check Number Is Neon Number or Not.
import java.util.*;
public class Q26Neon_Number
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,sum=0,sq;
  System.out.println("enter number");
  n=sc.nextInt();
  sq=n*n;
  
  while(sq>0)
  {
   sum=sum+(sq%10);
   sq=sq/10;
  }
  
  String msg=(sum==n)? "Neon":"Not Neon";
  System.out.println(msg);
 }
}
   
   
   