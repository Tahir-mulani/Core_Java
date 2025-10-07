/*
Find the Area of a Circle
Create a class CircleArea with a method findArea that calculates the area given the radius.
*/


import java.util.Scanner;
public class Areacircle
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		circleArea Ar = new circleArea();
		System.out.println("Enter radious of circle");
		int r=sc.nextInt();
		double result=Ar.findArea(r);
		System.out.println("Area of circle  is : "+result);
		
	}
}

class circleArea
{
	double findArea(int r)
	{
		Double area = 3.14*(r*r);
		return area;
	}
}
		
