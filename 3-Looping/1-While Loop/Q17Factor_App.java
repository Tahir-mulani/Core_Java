//Q17. Write a java program to find all factors of a number.
import java.util.*;
public class Q17Factor_App
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i=1;
  System.out.println("enter number from keyboard");
  n=sc.nextInt();
  while(i<=n)
  {
   if(n%i==0)
   {
    System.out.println(+i);
   }
   i++;
  }
 }
}