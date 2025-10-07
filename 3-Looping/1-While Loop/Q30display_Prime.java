//Q30. Write a java program to display 1 to nth Prime Number.
import java.util.*;
public class Q30display_Prime
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i=2;
  System.out.println("enter number");
  n=sc.nextInt();
  boolean flag=true;

   while(i<n)
   { 
	
     int j=2;
	 flag=true;
     while(j<i)
     { 
        if(i%j==0)
	    {
	     flag=false;
	      break;
	    }
	    j++;
	  }
	  if(flag)
	  {
		System.out.println(i);
      }
	  
	i++;
   }
   
	
   
 }
}

	 
     
    
    
	
   
 