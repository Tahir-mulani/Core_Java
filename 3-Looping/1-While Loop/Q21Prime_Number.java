//Q21.  Write a java program to check Number Is Prime Number or Not.
import java.util.*;
public class Q21Prime_Number
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i=2;
  System.out.println("enter number from keyboard");
  n=sc.nextInt();
  boolean flag=true;
  if(n<=0)
  {
	flag=false;//0 and 1 are not prime number.
  }
  else
  {
   while(i<=n/2)
   {
    if(n%i==0)
    {
     flag=false;
	 break;
     }
     i++;
   
   }
  }
  if(flag)
  {
	  System.out.println("number is prime");
   }
   else
   {
	  System.out.println("number is not prime");
    }
 }
}
  