//6.Write program to input number and check number is duck or not?
import java.util.Scanner;
public class DuckAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		boolean flag=false;
		while(n!=0)
		{
			int r=n%10;
			if(r==0)
			{
				flag=true;
				break;
			}
			n=n/10;
		}
		if(flag)
		{
			System.out.println("Duck Number");
		}
		else
		{
			System.out.println("not Duck Number");
		}
	}
}