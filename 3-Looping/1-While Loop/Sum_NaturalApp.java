//6.Write a C program to find the sum of all natural numbers between 1 to n.
import java.util.*;
public class Sum_NaturalApp
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n;
  System.out.printf("in");
  n=sc.nextInt();
  int sum=0;
  int i=0;
  while(i<=n)
  {
   sum=sum+i;
   i++;
  }
  System.out.printf("\nsum of all natural numebers from 1 to %d\n%d",n,sum);
 }
}
  
  