//Q.11
import java.util.*;
public class MaxApp
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n1,n2,n3;
  System.out.println("enter three number");
  n1=sc.nextInt();
  n2=sc.nextInt();
  n3=sc.nextInt();
  if(n1>n2 && n1>n3)
  {
  System.out.println("number 1 is maximum");
  }
  else if(n2>n1 && n2>n3)
  {
   System.out.println("number 2 is maximum");
   }
   else
   {
   System.out.println("number 3 is maximum");
   }
  }
 }