/*
2. Question:
 Create a class BankAccount with a method calculateInterest().
 Create subclasses SavingsAccount (interest rate 5%) and CurrentAccount (interest rate 3%).
 Calculate interest for different account types and display it.
Explanation:
 This tests inheritance with customized implementations in child classes.
*/

import java.util.Scanner;
class BankAccount
{
	double amount;
	BankAccount(double amount)
	{
		this.amount=amount;
	}
	double CalculateInterest()
	{
		return amount;
	}
	void displayInterest()
	{
		System.out.println("Interest :"+CalculateInterest());
	}
		
}
class SavingsAccount extends BankAccount
{
	SavingsAccount(double amount)
	{
		super(amount);
	}
	double CalculateInterest()
	{
		return amount*0.05;
	}
}
class CurrentAccount extends BankAccount
{
	CurrentAccount(double amount)
	{
		super(amount);
	}
	double CalculateInterest()
	{
		return amount*0.03;
	}
}
public class BankAccountAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter balance Amount");
		double amount=sc.nextDouble();
		
		SavingsAccount s = new SavingsAccount(amount);
		System.out.println("\nSaving Account Balance");
		s.displayInterest();
		
		CurrentAccount c = new CurrentAccount(amount);
		System.out.println("\nCurrent Account Balance");
		c.displayInterest();
	}
}