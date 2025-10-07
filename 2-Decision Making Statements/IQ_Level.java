//Q.50
import java.util.*;
public class IQ_Level
{
 public static void main(String x[])
 {
   Scanner sc=new Scanner(System.in);
   int i;
   System.out.println("enter your IQ level: ");
   i=sc.nextInt();
   i=i+7;
   if(i>170)
   {
    System.out.println("Yes");
   }
   else
   {
    System.out.println("No");
   }
  }
 }
    