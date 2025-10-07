//Q.56
import java.util.*;
public class Number_To_Name
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner (System.in);
  int n;
  System.out.println("enter number (1-5)");
  n=sc.nextInt();
  switch(n)
  {
   case 1:
   System.out.println("One");
   break;
   case 2:
   System.out.println("Two");
   break;
   case 3:
   System.out.println("Three");
   break;
   case 4:
   System.out.println("Four");
   break;
   case 5:
   System.out.println("Five");
   break;
   
   default:
   System.out.println("Invalid Input");
  }
 }
}
   