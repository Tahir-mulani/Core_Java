/*Q2. Write a Java program to display the following series:
100 81 64 49 36 25 16 9 4 1
(Perfect squares in reverse order)
*/
public class Perfect_Square_Reverse_Order
{
	public static void main(String x[])
	{
		int n = 10;
		
		series(n);
	}
	public static void series(int n)
	{
		if(n<1) return ;
		
		System.out.print(n*n+" ");
		
		series(n-1);
		
	}
}
