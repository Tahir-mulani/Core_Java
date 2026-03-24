class BankAccount
{
	private int balance = 100;
	public void updateBalance(int amount)
	{
		int temp = balance;
		System.out.println(Thread.currentThread().getName()+" read Balance "+balance);
		temp = temp+balance;
		try{
			Thread.sleep(200);
		}catch(Exception ex){
			System.out.println(ex);
		}
		balance = temp;
		System.out.println(Thread.currentThread().getName()+" Writes new Balance "+balance);
		
	}
	public int getBalance()
	{
		return balance;
	}
}
class Trans extends Thread
{
	BankAccount bankAccount;
	int value;
	Trans(BankAccount bankAccount,int value)
	{
		this.bankAccount = bankAccount;
		this.value = value;
	}
	public void run()
	{
		bankAccount.updateBalance(value);
	}
}
public class AsyncronizationAPP
{
	public static void main(String x[]) throws Exception
	{
		BankAccount account = new BankAccount();
		Trans deposit = new Trans(account,50);
		deposit.setName("Deposit");
		
		Trans withdraw = new Trans(account,-50);
		withdraw.setName("Withdraw");
		
		deposit.start();
		withdraw.start();
		
		deposit.join();
		withdraw.join();
		System.out.println("Final balance "+account.getBalance());
	}
}

		