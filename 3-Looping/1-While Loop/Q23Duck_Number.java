//Q23. Write a java program to Check Number Is Duck Number or Not.
import java.util.*;
public class Q23Duck_Number
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int no,rem;
  System.out.println("enter number");
  no=sc.nextInt();
  boolean flag=false;
  while(no!=0)
  {
    rem  = no % 10;
	no  = no /10;
	 if(rem==0)
		  { flag=true;
	         break;
		  }
  }
  if(flag)
  { 
    System.out.println("Number is duck");
  }
  else{
		   System.out.println("Number is not duck");
		  }
   }
}

