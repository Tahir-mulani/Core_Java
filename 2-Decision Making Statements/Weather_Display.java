//Q.40
import java.util.*;
public class Weather_Display
{
 public static void main(String x[])
 { 
  Scanner sc=new Scanner(System.in);
  int temp;
  System.out.println("enter temperature");
  temp=sc.nextInt();
  if(temp<0)
  {
   System.out.println("Freezing weather");
  }
  else if(temp>=0 && temp<=20)
  {
   System.out.println("Cold weather");
  }
  else if(temp>=21 && temp<35)
  {
   System.out.println("Warm weather");
  }
  else if(temp>=35)
  {
   System.out.println("Hot weather");
  }
  else
  {
   System.out.println("Invalid Tempreature");
  }
 }
}
  