//Q20. Write a java program to swap first and last digits of a number.
import java.util.*;
public class Q20Swap_First_Last
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,p,last,first,count=0,temp;
  System.out.println("enter number from keyboard");
  n=sc.nextInt();//12534
  temp=n;
  System.out.println("number before swapping: "+n);
  while(n!=0)
  {
   count++;//5
   n=n/10;
  }
  n=temp;//12534
  last=n%10;//extraxt last digit
  //n=n/10;//1253
  p=(int)Math.pow(10,--count);//calculate power 10000
  first=n/p;//extraxt first digit 1
  n=n%p;//remove first digit 2534
  n=n/10;//remove last digit 253
  last=last*p;
  n=n*10;//
  n=last+n+first;
  
  System.out.println("number after swapping: "+n);
 }
}
  
  
  