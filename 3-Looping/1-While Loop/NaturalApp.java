//Q1.Write a C program to print all natural numbers from 1 to n. - using while loop
import java.util.*;
public class NaturalApp
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i=1;
  System.out.println("natural number from 1 to ");
  n=sc.nextInt();
  while(i<=n)
  {
   
   System.out.println(+i);
   i++;
  }
 }
}
   