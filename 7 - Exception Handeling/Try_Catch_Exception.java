import java.util.*;
public class Try_Catch_Exception
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try{
			int c = a/b;
			System.out.println("Value of c "+c);
		} catch(Exception e){
			System.out.println("Error is  ---> "+e);
		}
	}
}