//8.Write a C program to find the sum of all odd numbers between 1 to n.
import java.util.*;
public class Sum_OddApp
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n;
  System.out.println("enter value");
  n=sc.nextInt();
  int sum=0;
  int i=1;
  while(i<=n)
  {
   sum=sum+i;
   i=i+2;
  }
  System.out.printf("sum of all odd number between1 to %d:%d",n,sum);
 }
} 