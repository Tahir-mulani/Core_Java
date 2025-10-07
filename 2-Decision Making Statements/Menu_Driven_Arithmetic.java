//Q.61
import java.util.*;
public class Menu_Driven_Arithmetic
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner (System.in);
  int choice,result;
  System.out.println("1.Addition");
  System.out.println("2.Subtraction");
  System.out.println("3.Multiplication");
  System.out.println("4.Division");
  System.out.println("enter choice (1-4)");
  choice=sc.nextInt();
  int n1,n2;
  System.out.println("Enter first number");
  n1=sc.nextInt();
  System.out.println("Enter Second numebr");
  n2=sc.nextInt();
  switch(choice)
  {
   case 1:
   {
	result=n1+n2;
    System.out.println("Addition: "+result);
	break;
   }
   case 2:
   {
	result=n1-n2;
    System.out.println("Subtraction: "+result);
	break;
   }
   case 3:
   {
	result=n1*n2;
    System.out.println("Multiplication: "+result);
	break;
   }
   case 4:
   {
	result=n1/n2; 
    System.out.println("Division: "+result);
	break;
   }
   default:
   {
    System.out.println("Invalid Input: !enter(1-4)");
   }
  }
 }
}
 