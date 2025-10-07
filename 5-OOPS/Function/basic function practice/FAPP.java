import java.util.*;
public class FAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		calSquare(n);  //================>function calling
		
	}                             //parameter
	public static void  calSquare(int val) //====>function defination
	{
		System.out.println("square of number is "+(val*val));
		
	
	}
}
