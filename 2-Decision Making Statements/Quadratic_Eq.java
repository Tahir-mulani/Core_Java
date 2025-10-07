//Q28.
import java.util.*;
public class Quadratic_Eq
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner (System.in);
  int a,b,c;
  double x,x1,x2,y;
  System.out.println("enter value");
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt();
  y=(b*b-4*a*c);
  if(y>0)
  {
	x1=(-b+Math.sqrt(y))/(2*a);
	x2=(-b-Math.sqrt(y))/(2*a);
  	System.out.println("x1 is: "+x1);
    System.out.println("X2 is: "+x2);
  }
  else if(y<0)
  {
    System.out.println("No Solution"); 
  }
  else 
  {
	x=-b/(2*a);
	System.out.println("x is: "+x);
  }
 }
}

    	  