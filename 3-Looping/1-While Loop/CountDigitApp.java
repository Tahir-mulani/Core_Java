//10.Write a C program to count the number of digits in a number.
import java.util.*;
public class CountDigitApp
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,count=0;
  System.out.println("enter number");
  n=sc.nextInt();
  while(n!=0)
  {
   n=n/10;
   count++;
  }

 System.out.println("Count Of digits: "+count);
} 
}