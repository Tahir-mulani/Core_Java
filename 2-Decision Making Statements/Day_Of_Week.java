//Q.31
import java.util.*;
public class Day_Of_Week
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n;
  System.out.println("Enter number between 1 to 7");
  n=sc.nextInt();
  if(n==1)
  {
   System.out.println("Monday");
  }
  else if(n==2)
  {
   System.out.println("Tuesday");
  }
   else if(n==3)
  {
   System.out.println("Wednesday");
  }
   else if(n==4)
  {
   System.out.println("Thursday");
  }
   else if(n==5)
  {
   System.out.println("Friday");
  }
   else if(n==6)
  {
   System.out.println("Saturday");
  }
   else if(n==7)
  {
   System.out.println("Sunday");
  }
   else 
  {
   System.out.println("Invalid Input");
  }
 }
}