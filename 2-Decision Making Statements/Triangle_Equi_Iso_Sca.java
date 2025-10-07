//Q.3
import java.util.*;
public class Triangle_Equi_Iso_Sca
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int s1,s2,s3;
  System.out.println("enter side");
  s1=sc.nextInt();
  s2=sc.nextInt();
  s3=sc.nextInt();
  if(s1==s2&&s2==s3)
  {
   System.out.println("Triangle is Equilateral");
  }
   else if(s1==s2&&s2!=s3)
  {
   System.out.println("Triangle is Isoscale");
   }
   else
   {
    System.out.println("Triangle is Scalene");
	}
 }
}