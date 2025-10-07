//Q33. Write a java program to display 1 to nth Strong Number.
import java.util.*;
public class Q33Display_Strong_Number
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i=1;
  System.out.println("enter number");
  n=sc.nextInt();
  while(i<=n)
  {  int temp=i;
     int digit=0;
     int sum=0;
     while(temp!=0)
     {   
       digit=temp%10;
	   int j=1,fact=1;
          while(j<=digit)
	      {
	        fact=fact*j;
	        j++;
	      }
	   sum=sum+fact;
	   temp=temp/10;
     }
	   if(sum==i)
	   {
	     System.out.println(i);
	     
	   }
    i++;
  }
 }
}
  