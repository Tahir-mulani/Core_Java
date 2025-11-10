import java.util.Scanner;
public class SwappApp
{
	public static void main(String x[])
	{	
		//Add Scanner class for input value from user
		Scanner sc = new Scanner(System.in);
		int a,b;              
		
		System.out.println("Enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.printf("before swapping:(a=%d,b=%d)",a,b);
		
		//using third variable temp
		int temp=a;
		a=b;
		b=temp;
		System.out.printf("\nafter swapping:(a=%d,b=%d)",a,b);
	}
}

		
		
		