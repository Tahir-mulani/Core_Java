//Q27. Write a java program to Check If a Number Is a Happy Number or Not.
import java.util.*;
public class Q27Happy_Number
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,digit=0,sum=0;
  System.out.println("enter number");
  n=sc.nextInt();
  while(n>9)
  {
	 while(n>0)
	 {
		digit=n%10;
		sum+=(digit*digit);
		n=n/10;
	 }
	 n=sum;
	 sum=0;
  }
  if(n==1)
  {
	  System.out.println("Happy Number");
  }
  else
  {
	  System.out.println("Not happy number");
  }
 }
}