//Q.44
import java.util.*;
public class Cab_Service
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int a,b;
  System.out.println("enter two cab services");
  a=sc.nextInt();
  b=sc.nextInt();
  if(a<=100 && b<=100 && a<b)
  {
   System.out.println("First");
  }
  else if(a<100 && b<100 && a>b)
  {
   System.out.println("Second");
  }
  else if(a==b)
  {
   System.out.println("Any");
  }
  else
  {
   System.out.println("Invalid Input");
  }
 }
}