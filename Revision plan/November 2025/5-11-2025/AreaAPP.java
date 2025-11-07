/*
Q2. Write program to create class name Area with methods name as void setRadius(float   radius) and void setLengthWidth(int len,int wid) and
 two child classes name as Circle and Rectangle so you have to define float getCircleArea() method in Circle child class and calculate
 area of circle  and return it and You have to define getRectArea() method in Rectangle class and calculate area of rectangle and return it
 */
 
import java.util.Scanner;
class Area
{
	float radius;
	int length,width;
	void setRadius(float radius)
	{
		this.radius=radius;
	}
	void setLengthWidth(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
}
class Circle extends Area
{
	float getCircleArea()
	{
		return (float)3.14*radius*radius;
	}
}
class Rectangle extends Area
{
	int getRectArea()
	{
		return length*width;
	}
}
public class AreaAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radious");
		float radius=sc.nextFloat();
		System.out.println("Enter length");
		int length=sc.nextInt();
		System.out.println("Enter Width");
		int width = sc.nextInt();
		
		Circle c = new Circle();
		c.setRadius(radius);
		System.out.println("Area of Circle is : "+c.getCircleArea());
		
		Rectangle r = new Rectangle();
		r.setLengthWidth(length,width);
		System.out.println("Area of Rectangle is : "+r.getRectArea());
		
		sc.close();
	}
}
 