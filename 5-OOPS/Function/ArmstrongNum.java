//Write a function to check if a number is an Armstrong number.

import java.util.Scanner;
public class ArmstrongNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();     //153
		boolean result= Arm(n);
		if(result)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
	}
	public static boolean Arm(int n)  //153
	{
		int count=0;
		int sum=0;
		int temp=n; // temp =153
		while(n!=0)
		{
			count++;   //3
			n=n/10;
		}
		n=temp;   //n=153
		while(n!=0)
		{
			int digit=n%10;  //3
			sum=sum+(int)Math.pow(digit,count); // 3^3
			n=n/10; //15
		}
		if(sum==temp)
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
}
	