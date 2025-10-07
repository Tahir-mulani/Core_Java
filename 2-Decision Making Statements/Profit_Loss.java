//Q7
import java.util.*;
public class Profit_Loss
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int sp,cp;
  System.out.println("Enter Selling and Cost price");
  sp=sc.nextInt();
  cp=sc.nextInt();
  if(sp>cp)
  {
   System.out.println("Profit");
  }
  else
  {
   System.out.println("Loss");
  }
 }
}