import java.util.Scanner;
public class PalindromeAPP
{
	public static void main(String x[])
	{
		//for input angle from user
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Enter three digit number");
		num=sc.nextInt();
		
		//reverse logic.
		int rev=((num%10)*100)+(((num/10)%10)*10)+(num/100);
		
		//reverse is equal to the input number is the palindrome number.		
		//By Using Ternary Operator
		String msg=(rev==num)? "Number is Palindrome":"Number is not Palindrome";
		System.out.println(msg);
	}
}