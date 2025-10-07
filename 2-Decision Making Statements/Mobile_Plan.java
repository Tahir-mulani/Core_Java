//Q.42
import java.util.*;
public class Mobile_Plan
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int min;
  System.out.println("enter Minutes used in month");
  min=sc.nextInt();
  double bill=199;
  if(min<=100)
  {
   
   bill=199;
  }
  else if(min<=300)
  {
   bill=199+(min-100)*1.0;
  }
  else if(min<=500)
  {
   bill=199+(min-100)*1.5;
  }
  else if(min>500)
  {
   bill=199+(min-100)*2;
  }
  System.out.println("Total Bill: "+bill);
 }
}
  