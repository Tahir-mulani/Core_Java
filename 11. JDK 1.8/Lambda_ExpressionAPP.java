@FunctionalInterface
interface PQR
{
	void show();
}
interface Square
{
	int getSquare(int n);
}
public class Lambda_ExpressionAPP
{
	public static void main(String x[])
	{
		PQR p =()->System.out.println("I am show from PQR");
		p.show();
		
		//step 1
		Square a =(int n)->{return n*n;};
		int result = a.getSquare(10);
		System.out.println("square is "+result);
		
		/*     OR
		Square a = (int n)->n*n;
		int result = a.getSquare(10);
		System.out.println("Square is "+result);
		*/	
		
		/*     OR
		
		*/
	}
}