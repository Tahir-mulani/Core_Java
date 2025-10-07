//Q39. Write a java program to find LCM of two numbers.//LCM(a,b)= a×b/GCD(a,b)
import java.util.*;
public class Q39LCM_TwoNumbers
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int a,b,i=1;
  System.out.printf("enter 1st number a=");
  a=sc.nextInt();
  System.out.printf("\nenter 2nd number b=");
  b=sc.nextInt();
  if(a>b)
  {
	  i=b;
  }
  else{
	  i=a;
	  
  }
  while(i>=1)
  {
	  if(a%i==0&&b%i==0)
	  {
		  
		  break;
	  }
	  i--;
  }
  
  System.out.println("LCM of (a,b):"+((a*b)/i));
 }
}
   