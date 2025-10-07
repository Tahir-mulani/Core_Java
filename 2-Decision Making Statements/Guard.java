//Q.47
import java.util.*;
public class Guard
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int a,b;
  System.out.println("Enter two integers");
  a=sc.nextInt();
  b=sc.nextInt();
  if(a>b || a==b)
  {
   System.out.println("Yes");
  }
  else
  {
   System.out.println("No");
  }
 }
}