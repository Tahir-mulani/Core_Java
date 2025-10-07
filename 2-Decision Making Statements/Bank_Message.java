//Q.58
import java.util.*;
public class Bank_Message
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int ch;
  System.out.println("Enter user choice");
  ch=sc.nextInt();
  switch(ch)
  {
   case 1:
    System.out.println("Deposit");
	break;
   case 2:
    System.out.println("Withdraw");
	break;
   case 3:
    System.out.println("Check Balance");
	break;
   case 4:
    System.out.println("Exit");
	break;
   default:
    System.out.println("Invalid Input");
   }
  }
}


  