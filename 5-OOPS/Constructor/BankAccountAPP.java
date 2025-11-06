/*
Q3.Problem:
 Create a class BankAccount with fields:
 accNo, accHolder, balance.
 Use:
A default constructor to set balance = 1000
A parameterized constructor to initialize all fields
A method deposit() to add money
A method display() to show details.
Hint: Use constructor overloading for default and parameterized constructors.
Explanation:
 This question tests constructor overloading — how multiple constructors can initialize objects differently.
 */
 
 import java.util.Scanner;
 class BankAccount
 {
	private double accNo;
	private String accHolder;
	private double balance;
	BankAccount()
	{
		balance=1000;
	}
	BankAccount(double accNo,String accHolder)
	{
		this.accNo=accNo;
		this.accHolder=accHolder;
		this.balance=balance;
	}
	void DepositeMoney(int deposite)
	{
		balance+=deposite;
	}
	void DisplaDetails()
	{
		System.out.println("Account Details");
		System.out.println("Account Number:"+accNo+"\nAccount Holder:" +accHolder+"\nBalance:" +balance);
	}		
 }
 public class BankAccountAPP
 {
	 public static void main(String x[])
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Account Number");
		 double accNo=sc.nextDouble();
		 System.out.println("Enter Account Holder Name");
		 sc.nextLine();
		 String accHolder=sc.nextLine();
		 System.out.println("Enter Account to deposit");
		 int deposit= sc.nextInt();
		 
		 BankAccount b = new BankAccount(accNo,accHolder);

		 b.DepositeMoney(deposit);
		 b.DisplaDetails();
	 }
		 
		 
	 
 }
 