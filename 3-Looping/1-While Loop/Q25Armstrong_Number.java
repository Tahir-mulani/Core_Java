//Q25. Write a java program to Check Number Is Armstrong Number or Not.
import java.util.*;
public class Q25Armstrong_Number
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,count=0,temp,rem=0,sum=0;
  System.out.println("enter a number");
  n=sc.nextInt();
  temp=n;
  while(n!=0)
  {
   count++;
   n=n/10;
  }
  n=temp;
  while(n!=0)
  {
	  rem=n%10;
	  n=n/10;
	  int p=1,j=1;
	  while(j<=count)
	  {
		  p=p*rem;
		  j++;
	  }
	  sum=sum+p;
  }
  
  String msg=(sum==temp)? "Armstrong":" not Armstrong";
  System.out.println(msg);
 }
}
	  

	
  