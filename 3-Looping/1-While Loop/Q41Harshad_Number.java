//Q41. Write a Java program to check whether a given number is a Harshad number (i.e., divisible by the sum of its digits) for numbers from 1 to n.
//Use a loop to iterate through numbers, then another loop to find sum of digits, then check divisibility.
//1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20, 21, 24, 27, 30, 36, 40, 42, 45, 48, 50, 54, 60, 63, 70, 72, 80, 81, 84, 90, and 100
import java.util.*;
public class Q41Harshad_Number
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int num,i=1;
  System.out.println("enter a number");
  num=sc.nextInt();
  while(i<=num)
  {
				int digit=0,sum=0;
				int n=i;
				while(n!=0)
				{ 
					digit=n%10;
					n=n/10;
					sum=sum+digit;
		
				}
				if(i%sum==0)
				{
					System.out.println(i);
					
				}
	i++;
  }
  
 }
}
   