//9.Write a C program to print a multiplication table of any number.
import java.util.*;
public class Multi_TabApp
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n;
  System.out.println("enter number");
  n=sc.nextInt();
  int i=1;
  while(i>=10)
  {
    System.out.println(n +"*" +i+"=" +(n*i));
	i++;
  }
 }
} 