/* 
Calculate Simple Interest
Create a class SimpleInterest with a method calculate that computes simple interest given principal, rate, and time.
Explanation: Demonstrates mathematical formula implementation.
*/

import java.util.Scanner;
class SimpleInterest
{
	int simpleInterest(int p,int r,int t)
	{
		int SI=(p*r*t)/100;
		return SI;
		
	}
}
	
public class InterestAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		SimpleInterest si = new SimpleInterest();
		System.out.println("Enter Principal Amount");
		int p =sc.nextInt();
		System.out.println("Enter rate of interest");
		int r=sc.nextInt();
		System.out.println("Enter Period of Time");
		int t=sc.nextInt();
		int result = si.simpleInterest(p,r,t);
		System.out.println("Simple Intrest is: "+result);		
		
	}
}
		
		
