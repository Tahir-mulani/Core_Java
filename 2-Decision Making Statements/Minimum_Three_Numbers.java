//Q.16
import java.util.*;
public class Minimum_Three_Numbers
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner (System.in);
  int a,b,c;
  System.out.println("Enter Three numbers");
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt();
  if(a<b && a<c)
  {
   System.out.println("A is minimum");
   }
   else if(b<a && b<c)
   {
    System.out.println("B is minimum");
	}
	else
	{
	 System.out.println("C is minimum");
	}
 }
}