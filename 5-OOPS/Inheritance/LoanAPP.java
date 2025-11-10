/*
8. Question:
 Create a base class Loan with fields amount and years.
HomeLoan has interest rate of 7%.
CarLoan has interest rate of 9%.
 Write a program to calculate and print EMI for both loans.
Explanation:
 Tests inheritance with customized formula calculations.
 */

import java.util.Scanner;
class Loan
{
	double amount,years;
	Loan(double amount,int years)
	{
		this.amount=amount;
		this.years=years;
	}
	double CalculateEMI()
	{
		double r=(0.07/12)/100;
		int n=(int)years*12;
		double temp=1;
		for(int i=1;i<n;i++)
		{
			temp=temp*(1+r);
		}
		double emi=(amount*r*temp)/(temp-1);
		return emi;
	}
	void TotalEMI()
	{
		System.out.println(CalculateEMI());
	}
}	
class HomeLoan extends Loan
{
	HomeLoan(double amount,int years)
	{
		super(amount,years);
	}
	double CalculateEMI()
	{
		double r=(0.07/12)/100;
		int n=(int)years*12;
		double temp=1;
		for(int i=1;i<n;i++)
		{
			temp=temp*(1+r);
		}
		double emi=(amount*r*temp)/(temp-1);
		return emi;
	}
}	
class CarLoan extends Loan
{
	CarLoan(double amount,int years)
	{
		super(amount,years);
	}
	double CalculateEMI()
	{
		double r=(0.09/12)/100;
		int n=(int)years*12;
		double temp=1;
		for(int i=1;i<n;i++)
		{
			temp=temp*(1+r);
		}
		double emi=(amount*r*temp)/(temp-1);
		return emi;
	}
}
public class LoanAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Loan Amount");
		double amount=sc.nextDouble();
		
		System.out.println("Enter Number of Years for Repayement");
		int years=sc.nextInt();
		
		HomeLoan home = new HomeLoan(amount,years);
		System.out.println("---For Home Loan---");
		home.TotalEMI();
		
		CarLoan car = new CarLoan(amount,years);
		System.out.println("---For Car Loan---");
		car.TotalEMI();
	
	}
	
}
