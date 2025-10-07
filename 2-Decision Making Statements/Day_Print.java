//Q.54
import java.util.*;
public class Day_Print
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int d;
  System.out.println("enter day number(1-7)");
  d=sc.nextInt();
  
  
  switch(d)
  {
   case 1:
   System.out.println("Monday");
   break;
   case 2:
   System.out.println("Tuesday");
   break;
   case 3:
   System.out.println("Wednesday");
   break;
   case 4:
   System.out.println("Thursday");
   break;
   case 5:
   System.out.println("Friday");
   break;
   case 6:
   System.out.println("Weekend,Saturday");
   break;
   case 7:
   System.out.println("Weekend,Sunday");
   break;
   
   default:
   System.out.println("Invalid Input");
  }
 }
}