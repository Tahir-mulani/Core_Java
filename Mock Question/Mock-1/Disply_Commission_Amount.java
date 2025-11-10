import java.util.Scanner;
public class Disply_Commission_Amount
{
	public static void main(String x[])
	{
		//Add Scanner class for input from user.
		Scanner sc = new Scanner(System.in);
		int sa,com;
		
		System.out.println("Enter Sale Amount");
		sa=sc.nextInt();
		
		//By using else if ladder
		if(sa<5000)
		{
			com=sa*2/100;
			System.out.println("Commission Amount is:"+com);
		}
		else if(sa>=5000 && sa<=10000)
		{
			com=sa*5/100;
			System.out.println("Commision Amount is:"+com);
		}
		else
		{
			com=sa*10/100;
			System.out.println("Commision Amount is:"+com);
		}
	}
}
			