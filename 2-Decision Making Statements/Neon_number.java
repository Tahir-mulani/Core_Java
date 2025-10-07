//Q.21
import java.util.*;
public class Neon_number
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n;
  System.out.println("Enter number");
  n=sc.nextInt();
  int sq=n*n;
  if(sq%10+sq/10==n)
  {
   System.out.println("number is Neon number");
   }
  else
  {
   System.out.println("Number is not neon number");
  }
 }
}