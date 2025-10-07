/*
10. Bank Account Balance Update
Task:
 Create a BankAccount class with fields: accountHolderName and balance.
 In the main method:
Create a BankAccount object.
Deposit an amount into the account and print the updated balance.
Explanation:
 This introduces updating object fields and performing logical operations.
*/

import java.util.Scanner;
class BankAccount
{
	private String accountHolderName;
	private double balance;
	
	public void setAccountHolderName(String name)
	{
		accountHolderName = name;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	
	public void setBalance(double b)
	{
		balance = b;
	}
	public double getBalance()
	{
		return balance;
	}
}
public class BankAccountBalanceAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		BankAccount ac = new BankAccount();
		
		System.out.println("\n-----> Bank Account Details <------\n");
		
		System.out.println("Enter Account Holder Name");
		String name = sc.nextLine();
		ac.setAccountHolderName(name);
		
		System.out.println("Enter Balance Amount");
		double balance = sc.nextDouble();
		ac.setBalance(balance);
		System.out.println("-----------------------------------------------");
		System.out.println("Updated Account Details\n");
		System.out.println("Account Holder Name: "+ac.getAccountHolderName());
		System.out.println("Account Balalnce is: "+ac.getBalance());
		
	}
}