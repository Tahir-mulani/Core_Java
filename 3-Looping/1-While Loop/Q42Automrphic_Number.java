//Q42. Write a Java program to print all automorphic numbers between 1 and n.
//An automorphic number’s square ends with the number itself (e.g., 5² = 25).
//The automorphic numbers from 1 to 100 are 1, 5, 6, 25, 76. 
import java.util.*;
public class Q42Automrphic_Number
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int num,i=1;
  System.out.println("enter nth number:");
  num=sc.nextInt();
  while(i<=num)
  {
    int temp=i,count=0,m=1;
	while(temp>0)
    {
     temp/=10;
	 count++;
	 m*=10;
	}
	 int sq=i*i;
      if(i==(sq%m))
      {
	   System.out.println(i);
      }
    i++;
  }
  
 }
}
  
  