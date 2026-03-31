abstract class ATM
{
	abstract void process();
}
class Withdraw extends ATM
{
	void process(){
	
		System.out.println("Money Withdraw");
	}
}
class Deposite extends ATM
{
	void process(){
		System.out.println("Money Deposited successfully");
	}
}
public class ATM_MachineAPP
{
	public static void main(String x[])
	{
		ATM user = new Withdraw();
		user.process();
		
		user = new Deposite();
		user.process();
	
	}
}