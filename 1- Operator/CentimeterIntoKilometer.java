import java.util.Scanner;
public class CentimeterIntoKilometer
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length in cm");
		int length = sc.nextInt();
		
		int kilometer = length*1000;
		System.out.print("After Converted Length is "+kilometer+" Km");
		
	}
}