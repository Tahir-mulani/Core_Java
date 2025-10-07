//Q.62
import java.util.*;
public class Check_Number_NegPosZero
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int choice;
  System.out.println("1.Check Number is positive,negative or zero.");
  System.out.println("2.Check number is Even or odd.");
  System.out.println("3.Find Max number using 2 numbers.");
  System.out.println("enter your choice(1-3)");
  choice=sc.nextInt();
  switch(choice)
  {
   case 1:
    {
     int n;
	 System.out.println("Enter a number: ");
	 n=sc.nextInt();
	 if(n>0)
	 {
	  System.out.println("Positive");
	 }
	 else if(n<0)
	 {
	  System.out.println("Negative");
	 }
	 else
	 {
	  System.out.println("Zero");
	 }
	 break;
	}
   case 2:
	{
	 int num;
	 System.out.println("Enter a number: ");
	 num=sc.nextInt();
	 if(num%2==0)
	 {
	  System.out.println("Even");
	 }
	 else
	 {
	  System.out.println("Odd");
	 }
	 break;
	}
   case 3:
    {
	 int n1,n2;
	 System.out.println("Enter two numbers");
	 n1=sc.nextInt();
	 n2=sc.nextInt();
	 if(n1>n2)
	 {
	  System.out.println("n1 is Max");
	 }
	 else
	 {
	  System.out.println("n2 is Max");
	 }
	 break;
	}
	default:
	{
	 System.out.println("Invalid Input");
	}
  }
 }
}
	 