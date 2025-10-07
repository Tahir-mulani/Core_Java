//Q35. Write a java program to find the frequency of each digit in a given integer.
import java.util.*;
public class Q35Frequency_EachInteger
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,count=0,temp,digit=0;
  System.out.println("enter number");
  n=sc.nextInt();
  temp=n;
  while(n!=0)
  {
   digit =n%10;
   n=n/10;
   digit++;
   }
   System.out.println("number of digit is:"+count);
  }
 }
   
	
   