//Q12. Write a java program to calculate the product of digits of a number.
import java.util.*;
public class Q12Product_Digit
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,mult=1,i=1;
  System.out.println("enter number");
  n=sc.nextInt();
  while(i<=n && i!=0)
  {
    int count=n%10;//3
   mult=count*mult;
   n=n/10;
   i++;
  }
 System.out.println("Product of Digits: "+mult);
}
}