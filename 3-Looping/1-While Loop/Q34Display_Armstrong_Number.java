//Q34. Write a java program to display 1 to nth Armstrong Number.
import java.util.*;
public class Q34Display_Armstrong_Number
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i=1;
  System.out.println("enter number");
  n=sc.nextInt();
  while(i<=n)
  {
    int count=0;
	int temp=i;
	//count number of digits
	int num=temp;
	while(num!=0)
	{
	 count++;
	 num=num/10;
	}
	    num=temp;
		int sum=0;
		//calculate sum of digits raised to the power of count
	    while(num!=0)
        {
	      int rem=num%10;
	      int p=1,j=1;
	      while(j<=count)
	      {
		     p=p*rem;
		     j++;
	      }
	       sum=sum+p;
		   num=num/10;
		}
		//check for armstrong number
	    if(sum==temp)
	       {
	          System.out.println(temp);
	        }
	    
	i++;
   }
  }
 
}
	