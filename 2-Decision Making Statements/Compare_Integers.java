//Q.36
import java.util.*;
public class Compare_Integers
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int a,b;
  System.out.println("enter two integers");
  a=sc.nextInt();
  b=sc.nextInt();
  if(a>b)
  {
   System.out.println("A is greater & B is smaller");
  }
  else if(a==b)
  {
   System.out.println("integer are equal");
  }
  else 
  {
   System.out.println("Invalid Input");
  }
 }
}