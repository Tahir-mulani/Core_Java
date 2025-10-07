//Q2.
import java.util.*;
public class Check_Tri_Valid
{
	public static void main(String x[])
	{
  Scanner sc=new Scanner(System.in);
  int s1,s2,s3,sum;
  System.out.println("enter side");
  s1=sc.nextInt();
  s2=sc.nextInt();
  s3=sc.nextInt();
  sum=s1+s2+s3;
  if(sum==180)
  {
   System.out.println("triangle is valid");
   }
   else
   {
    System.out.println("triangle is invalid");
   }
  }
 }
   