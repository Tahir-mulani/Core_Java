//Q32. Write a java program to display 1 to nth Duck Number.
import java.util.*;
public class Q32Display_Duck_Number
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i=1;
  System.out.println("enter a number");
  n=sc.nextInt();
  //boolean flag=false;
  while(i<=n)
  {
    int rem=0,temp=i;
       while(temp!=0)
       {
         rem  = temp % 10;
	       temp = temp/10;
	       if(rem==0)
		  { 
	         System.out.println(i);
			 break;
		  }
		 
	   }
	 i++;
  }
  
 }
}