//Q38. Write a java program to find HCF (GCD) of two numbers.(Highest Common Factor)
import java.util.*;
public class Q38HCF_TwoNumbers
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int a,b,i=1;
  System.out.printf("enter 1st number a=");
  a=sc.nextInt();//12
  System.out.printf("\nenter 2nd number b=");
  b=sc.nextInt();//18
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
		  System.out.println("GCD is ="+i);
		  break;
	  }
	  i--;
  }
  //System.out.println(a);
 }
}
   