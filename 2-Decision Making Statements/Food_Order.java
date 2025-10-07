//Q.60
import java.util.*;
public class Food_Order
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner (System.in);
  int n;
  System.out.println("enter food number(1-4)");
  n=sc.nextInt();
  switch(n)
  {
   case 1:
    System.out.println("Burger and Price is 99rs");
	break;
   case 2:
    System.out.println("Pizza and Price is 80rs");
	break;
   case 3:
    System.out.println("Pasta and Price is 50rs");
	break;
   case 4:
    System.out.println("Sandwich and Price is 60rs");
	break;
   default:
    System.out.println("Invalid Input");
  }
 }
}