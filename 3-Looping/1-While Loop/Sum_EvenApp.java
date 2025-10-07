//7.Write a C program to find the sum of all even numbers between 1 to n.
import java.util.*;
public class Sum_EvenApp
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n;
  System.out.println("enter value");
  n=sc.nextInt();
  int sum=0;
  int i=0;
  while(i<=n)
  {
   sum=sum+i;
   i=i+2;
  }
  System.out.printf("sum of all even numbers between 1 to %d:%d",n,sum);
 }
} 