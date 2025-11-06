//8.Write program to input number and check number is Armstrong or not?

import java.util.*;
public class ArmstrongApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter number");
		n = sc.nextInt();
		int temp=n;
		int count=0;
		
		//count digit.
		while(n!=0)
		{
			count++;  //3
			n=n/10;
		}
		n=temp;
		int sum=0,rem=0;
		
		//armstrong logic
		while(n!=0)
		{
			rem=n%10; 
			sum=sum+((int)Math.pow(rem,count));
			n=n/10; 
		}
		n=temp;
		String str=(n==sum)?"Armstrong":"not armstrong";
		System.out.println(str);
	}
}
