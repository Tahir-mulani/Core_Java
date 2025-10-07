//Q.59
import java.util.*;
public class Display_Season
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n;
  System.out.println("enter number (1-4)");
  n=sc.nextInt();
  switch(n)
  {
   case 1:
    System.out.println("Spring");
    break;
   case 2:
    System.out.println("Summer");
    break;
   case 3:
    System.out.println("Autumn");
    break;
   case 4:
    System.out.println("Winter");
    break;
   
   default:
    System.out.println("Invalid Input");
  }
 }
}