//Q24. Write a java program to Check Number Is Strong Number or Not.
import java.util.*;
public class Q24Strong_Number
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,digit=0,sum=0,temp;
  System.out.println("enter number");
  n=sc.nextInt();
  temp=n;
  while(n!=0)
  {   
    digit=n%10;
	int j=1,fact=1;
	while(j<=digit)
	{
	 fact=fact*j;
	 j++;
	}
	sum=sum+fact;
	n=n/10;
  }
  String msg=(sum==temp)? "Number is Strong":"Number is not Strong";
  System.out.println(msg);
 }
}
	 
   