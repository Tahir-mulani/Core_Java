//Q.43
import java.util.*;
public class Library_Fine
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int day;
  System.out.println("Enter Number of Days");
  day=sc.nextInt();
  String membership="Active";
  double fine=0;
  if(day<=5)
  {
   fine=day*2;
  }
  else if(day<=10)
  {
   fine=day*3;
  }
  else if(day<=30)
  {
   fine=day*5;
  }
  else
  {
   fine=500;
   membership="cancelled";
  }
  System.out.println("Total fine: "+fine);
  System.out.println("Membership status: "+membership);
 }
}
   