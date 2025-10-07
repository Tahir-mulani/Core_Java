//Q.45
import java.util.*;
public class TV_Volume
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner (System.in);
  int a,b;
  System.out.println("enter two integers");
  a=sc.nextInt();
  b=sc.nextInt();
  if(a>b)
  {
   int val=a-b;
   System.out.println("first Volume is decrease by: "+val);
  }
  else
  {
   int val=b-a;
   System.out.println("first Volume is increase by: "+val);
  }
 }
}
  