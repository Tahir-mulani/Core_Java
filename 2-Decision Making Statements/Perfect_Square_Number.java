//Q.20
import java.util.*;
public class Perfect_Square_Number
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n;
  System.out.println("enter number");
  n=sc.nextInt();
  int sq=(int)Math.sqrt(n);
  System.out.println(sq);
  if(sq*sq==n)
  {
   System.out.println("Number is Perfect square");
   }
  else
  {
   System.out.println("Number is not Perfect square");
   }
  }
 }