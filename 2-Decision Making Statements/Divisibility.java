//Q.5
import java.util.*;
public class Divisibility
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int num;
  System.out.println("enter number");
  num=sc.nextInt();
  if(num%5==0&&num%11==0)
  {
   System.out.println("Number is divisible by both 5 and 11");
   }
   else
   {
     System.out.println("Number is not divisible by 5 and 11");
   }
 }
 }