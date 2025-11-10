import java.util.Scanner;
public class Aithmetic_Operator
{
	public static void main(String x[])
	{
		//take input from user
		Scanner sc=new Scanner(System.in);
		int a,b,ch;
		System.out.println("Enter Two Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		
		//for choice we use ch variable
		System.out.println("Enter choice between 1 to 5");
		System.out.println("1.Addition,2.Subtraction,3.Multiplication,4.Division,5.Modulous");
		ch=sc.nextInt();
		
		//using switch case
		switch(ch)
		{
			case 1:
				System.out.println("Addition is:"+(a+b));
				break;
			case 2:
				System.out.println("Subtraction is:"+(a-b));
				break;
			case 3:
				System.out.println("Multiplication is:"+(a*b));
				break;
			case 4:
				System.out.println("Division is:"+(a/b));
				break;
			case 5:
				System.out.println("Modolus is:"+(a%b));
				break;
			default:
				System.out.println("Invalid Choice");
		}
	}
}
			
		
		
		