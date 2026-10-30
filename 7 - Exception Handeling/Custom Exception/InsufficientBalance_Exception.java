import java.util.*;
class InsufficientBalanceException extends RuntimeException
{
	InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
class Bank{
	Bank(int amount, int balance)
	{
			if(amount >= balance)
			{
				throw new InsufficientBalanceException("Balance is not Sufficient, Can't Withdraw Amount..!");
			}
			System.out.println("Transaction Completed, Available Balance :"+(balance-amount));
	}
}

public class InsufficientBalance_Exception
{
	public static void main(String x[])
	{
		
		try(Scanner sc = new Scanner(System.in))
		{		System.out.println("Enter withdraw amount");
		int amount = sc.nextInt();
		int balance = 1000;
			Bank b = new Bank(amount, balance);
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
		} catch(InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
	