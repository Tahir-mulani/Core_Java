//Q28. Write a java program to Check Number Is Spy Number or Not.
import java.util.*;
public class Q28Spy_Number
{
 public static void main(String x[])
 {
  Scacnner sc=new Sccanenr(System.in);
  int n,digit=0,temp,product=1;
  System.out.println("enter a number");
  n=sc.nextInt();
 
  while(n!=0)
  {
   digit=n%10;
   sum+=digit;
   product*=digit;
   n=n/10;
  }
 
  String msg=(sum==product)? "Spy Number":"Not Spy Number";
  System.out.println(msg);
   