//number is automorphic or not
import java.util.*;
public class TestAutomorphic
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  long n,sq,count=0,m=1;
  System.out.println("enter number");
  n=sc.nextLong();
  long temp=n;
  boolean flag=false;
  while(temp>0)
  {
    temp/=10;
	count++;
	m*=10;
	}
	//System.out.println("count="+count);
	System.out.println("nth place="+m);
	sq=n*n;
	System.out.println("Sqare="+sq);
 if(n==(sq%m))
 {System.out.println("Automorphic");
 }
 else{
	 System.out.println("Not Automorphic");
 }
}
}
  