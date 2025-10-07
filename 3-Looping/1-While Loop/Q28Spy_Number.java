//Q28. Write a java program to Check Number Is Spy Number or Not.
import java.util.*;
public class Q28Spy_Number
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,digit=0,product=1,sum=0;
  System.out.println("enter a number");
  n=sc.nextInt();
  while(i<=n)
  {  
    
      digit=n%10;
      sum+=digit;
      product*=digit;
      n=n/10;
    }
  }
   
  String msg=(sum==product)? "Spy Number":"Not Spy Number";
  System.out.println(msg);
 }
}
   