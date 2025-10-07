//Q13. Write a java program to enter a number and print its reverse.
import java.util.*;
public class Q13Print_Reverse
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i=1,rem;
  System.out.println("enter number");
  n=sc.nextInt();
  while(n!=0)
  {
   rem=n%10;
   n=n/10;
   i++;
   System.out.printf("%d",rem);
  }
 }
}
