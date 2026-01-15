//Q1. Write a java program to display 1 to nth Strong Number.
import java.util.*;
public class StrongNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth number");
		int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++)
		{
			int sum=0,temp = i;
			while(temp!=0){
				int rem = temp%10;
				int fact = 1;
				for(int j=1;j<=rem;j++)
				{
					fact = fact*j;
					
				}
				sum = sum + fact;
				temp= temp /10;
			}
			if(sum == i){
				System.out.println(i);
			}
		}
	}
}

		