//1.Write program to input two values using command line argument and perform its swapping?
public class SwapApp
{
	public static void main(String x[])
	{
		
		int a=Integer.parseInt(x[0]);
		int b=Integer.parseInt(x[1]);
		System.out.println("before swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
	
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
		
		