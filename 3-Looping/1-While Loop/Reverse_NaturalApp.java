//Q2.Write a C program to print all natural numbers in reverse (from n to 1). - using while loop
import java.util.*;
public class Reverse_NaturalApp
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i=1;
  System.out.println("all natural numbers reverse");
  n=sc.nextInt();
  while(i<n)
  {
   n--;
   System.out.println(n);
  }
 }
}