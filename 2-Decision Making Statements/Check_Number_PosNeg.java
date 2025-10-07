//Q4.
import java.util.*;
public class Check_Number_PosNeg
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner (System.in);
  int num;
  System.out.println("Enter number");
  num=sc.nextInt();
  if(num>0)
  {
   System.out.println("number is posistive");
  }
  else if(num<0)
  {
   System.out.println("number is negative");
   }
   else
   {
    System.out.println("number is zero");
    }
}
}