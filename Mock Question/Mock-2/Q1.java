/*
Q1. Task: For a number n, calculate:
Sum of digits at even places (from right)
Sum of digits at odd places (from right)
Finally print the difference of these sums.
Example: n = 572631 → even places sum = 7+6+1 = 14,
odd places sum = 5+2+3 = 10 → difference = 4.
*/
import java.util.Scanner;
public class Q1
{
	public static void main(String x[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int n = sc.nextInt();
		
		int count=1;
		int oddSum=0;
		int evenSum=0;
		
		while(n!=0)
		{
			int rem=n%10; //extract the last digit.
			if(count%2==0)
			{
				evenSum+=rem;
			}
			else
			{
				oddSum+=rem;
			}
			n=n/10;			//remove last digit.
			count++;
		}
		System.out.printf("Even sum :%d\n",evenSum);
		System.out.printf("Odd sum :%d\n",oddSum);
		if(evenSum>oddSum)
		{
			System.out.println("Difference is: "+(evenSum-oddSum));
		}
		else
		{
			System.out.println("Difference is: "+(oddSum-evenSum));
		}				
	}
}