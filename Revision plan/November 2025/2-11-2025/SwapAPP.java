//1.Write program to input two values using command line argument and perform its swapping?

public class SwapAPP
{
	public static void main(String x[])
	{
		int a=Integer.parseInt(x[0]);
		int b=Integer.parseInt(x[1]);
		System.out.println("before swap\na= "+a+"b= "+b);
		/*int temp=a;
		a=b;
		b=temp;
		*/
		a=a+b;  
		b=a-b;  
		a=a-b;  
		System.out.println("After swap\na= "+a+"b= "+b);
		
	}
}