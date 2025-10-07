//Q.34
import java.util.*;
public class Bonus_Amount
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner (System.in);
  int s,y;
  System.out.println("enter year of service");
  y=sc.nextInt();
  System.out.println("enter salary");
  s=sc.nextInt();
  if(s>5)
  {
   int bonus=s*5/100;
   System.out.println("Bonus Amount: "+bonus);
  }
  else
  {
   System.out.println("No Bonus");
  }
 }
}