//Q11. Write a java program to calculate the sum of digits of a number.
import java.util.*;
public class Q11Digit_Sum_App
{
 public static void main(String x[])
 { 
  Scanner sc=new Scanner(System.in);
  int n,sum=0,i=1,rem=0;
  System.out.println("enter number");
  n=sc.nextInt();//153
  while(n!=0)
  {
   rem=n%10;
   n=n/10;
   sum=sum+rem;
   i++;
  }
  System.out.println("Sum of digits of number is: "+sum);
 }
}
   