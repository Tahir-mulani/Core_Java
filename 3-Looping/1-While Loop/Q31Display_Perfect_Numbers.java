//Q31. Write a java program to display 1 to nth Perfect Number.
import java.util.*;
public class Q31Display_Perfect_Numbers
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,sum,j=1;
  System.out.println("enter number");
  n=sc.nextInt();
  
  while(j<=n)
  {
	int i=1;
	
	sum=0;
       while(i<j)
       { 
           if(j%i==0)
           {
	        sum=sum+i;
		   }
		i++;
	   }
		if(sum==j)
	       {
		   System.out.println(j);
	       }
	 j++;
	 sum=0;
    }
 }
}

   
	
	   
	 