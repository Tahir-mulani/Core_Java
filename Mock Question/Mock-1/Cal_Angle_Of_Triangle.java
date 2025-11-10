import java.util.Scanner;
public class Cal_Angle_Of_Triangle
{
	public static void main(String x[])
	{
		//for input angles from user
		Scanner sc = new Scanner(System.in);
		int a1,a2,a3;
		
		//input two angles from keyboard
		System.out.println("Enter two angles of triangle");
		a1=sc.nextInt();
		a2=sc.nextInt();
		
		//sum of three angles of a triangle is 180
		//a1+a2+a3=180
		a3=180-(a1+a2);
		System.out.println("Third angle of triangle is:"+a3);
	}
}