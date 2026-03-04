import java.util.Scanner;
public class SwapWithoutVariable
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int a = sc.nextInt();
		int b =  sc.nextInt();
		System.out.println("before a ="+a+" b ="+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("after a ="+a+" b ="+b);
	}
}
		