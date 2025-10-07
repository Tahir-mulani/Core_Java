//Q22. Write a java program to Check Number Is Perfect Number or Not.
import java.util.*;
public class Q22Perfect_Number
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,sum=0,i=1;
  System.out.println("enter number");
  n=sc.nextInt();
   
  while(i<n)
  { 
    if(n%i==0)
     {
	   //System.out.println(i);
	   sum=sum+i;
      }
   i++;
  }
  
  String msg=(sum==n)? "No is Perfect":"No is not perfect";
  System.out.println(msg);
 }
 
}
