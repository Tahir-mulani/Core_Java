/*
Q4. Write program to create class name as Area with constructor overloading
       Area(float radius): this function can accept radius as input and calculate circle Area
      Area(int len,int width): this function can accept len and width as input and calculate area of rectangle
*/
import java.util.Scanner;
class Area
{
	Area(float radious)
	{
		double areaCircle=3.14*radious*radious;
		System.out.println("Area of Circle is :"+areaCircle);
	}
	Area(int length,int width)
	{
		double areaRec=length*width;
		System.out.println("Area of Rectangle is: "+areaRec);
	}
}
public class AreaAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radious of Circle");
		float radious=sc.nextFloat();
		System.out.println("Enter Length");
		int length=sc.nextInt();
		System.out.println("Enter width");
		int width=sc.nextInt();
		Area a1= new Area(radious);
		Area a2=new Area(length,width);
		
	}
}
		