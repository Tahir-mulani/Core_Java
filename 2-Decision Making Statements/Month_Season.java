//Q.37
import java.util.*;
public class Month_Season
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner (System.in);
  int n;
  System.out.println("enter month number");
  n=sc.nextInt();
  if(n>=1 && n<=3)
  {
   System.out.println("Winter Season");
  }
  else if(n>=4 && n<=6)
  {
   System.out.println("Spring Season");
  }
  else if(n>=7 && n<=9)
  {
   System.out.println("Summer Season");
  }
    else if(n>=10 && n<=12)
  {
   System.out.println("Autumn Season");
  }
  else
  {
   System.out.println("Invalid Month Number");
  }
 }
}
  