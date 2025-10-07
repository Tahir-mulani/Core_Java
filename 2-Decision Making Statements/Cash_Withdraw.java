//Q.46
import java.util.*;
public class Cash_Withdraw
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  double w,b;
  System.out.println("enter balance amount: ");
  b=sc.nextDouble();//total balance amount
  System.out.println("enter withdraw amount: ");
  w=sc.nextDouble();
  //condition for successful transaction
  if(w>0 && w+0.50<=b)
  {
    b=b-w-0.50;
   }
   //print result
   System.out.println("Account balance"+b);
  }
}
  