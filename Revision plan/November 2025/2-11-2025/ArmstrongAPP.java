//8.Write program to input number and check number is Armstrong or not?
import java.util.Scanner;
public class ArmstrongAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int temp=n;
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		n=temp;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			int p=1;
			for(int i=1;i<=count;i++)
			{
				p=p*rem;
			}
			sum+=p;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("not Armstrong");
		}
	}
}