/*Q1. Problem Statement:
Write a menu-driven program using do-while and switch-case to perform operations on
a bank account balance (initial balance entered by user):
1.Deposit money.
2.Withdraw money (only if sufficient balance).
3.Check current balance.
4.Exit.
Program should repeatedly allow operations until exit.
*/

import java.util.*;
public class AccountBalance
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int balance;
		System.out.println("Enter balance");
		balance=sc.nextInt();
		do{
			System.out.println("1.Deposit money");
			System.out.println("2.withdraw money");
			System.out.println("3.check balance enquiry");
			System.out.println("4.Exit");
			int t;
			t=sc.nextInt();
			
			switch(t){
				
				case 1:
					int deposite=sc.nextInt();
					balance=balance+deposite;
					System.out.println("Deposite Amount:"+deposite);
					continue;
				case 2:
					int withdraw=sc.nextInt();
					if(withdraw<balance){
						balance=balance-withdraw;
					}
					continue;
				case 3:
					System.out.println("Current Balance Amount:"+balance);
					continue;
				case 4:
					 System.out.println("Tranjaction complete");
					 break;
			}
			if(t==4){
				break;
			}
		}while(true);
	}
}
		