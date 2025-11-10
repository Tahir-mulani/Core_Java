import java.util.Scanner;
public class Check_Triangle
{
	public static void main(String x[])
	{
		//Add Scanner class for input from user
		Scanner sc = new Scanner(System.in);
		//triangle had three side.
		int side1,side2,side3;
		
		//input three side of triangle.
		System.out.println("enter three side of Triangle:");
		side1=sc.nextInt();
		side2=sc.nextInt();
		side3=sc.nextInt();
		
		//Using else if ladder
		if(side1==side2 && side2==side3)
		{
			System.out.println("Triangle is Equilateral");
		}
		else if(side1!=side2 && side1==side3 && side2!=side3)
		{
			System.out.println("Triangle is Isoscale");
		}
		else
		{
			System.out.println("Triangle is Scalene");
		}
	}
}
		
		
		