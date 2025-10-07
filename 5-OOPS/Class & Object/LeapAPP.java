/*
18. Check Leap Year
Create a class LeapYearChecker with a method isLeapYear to check if a year is a leap year.
Explanation: Implements logical conditions for leap year calculation.
*/

import java.util.Scanner;
public class LeapAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		int y=sc.nextInt();
		LeapYearChecker leap=new LeapYearChecker();
		leap.isLeapYear(y);
	}
}
class LeapYearChecker
{
	void isLeapYear(int y)
	{
		if((y%4==0 && y%100!=0) || y%400==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}
}
