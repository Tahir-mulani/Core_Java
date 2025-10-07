//Q.23
import java.util.*;
public class Spy_Number
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner (System.in);
  int n,sum,product;
  System.out.println("enter number");
  n=sc.nextInt();//1412
  sum=(n%10)+((n/10)%10)+((n/10)/10%10)+((n/10)/10/10);
        //2       //1         //4            //1
  product=(n%10)*((n/10)%10)*((n/10)/10/10)*((n/10)/10%10);
  if(sum==product)
  {
   System.out.println("Number is spy number");
  }
  else
  {
   System.out.println("Number is not spy number");
  }
 }
}