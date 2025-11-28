class Bank
{
	double getRateofInterest()
	{	
		return 0;
	}
}
class SBI extends Bank
{
	double getRateofInterest()
	{
		return 6.5;
	}
}
class HDFC extends Bank
{
	double getRateofInterest()
	{
		return 7.2;
	}
}
public class BankInterestAPP
{
	public static void main(String x[])
	{	
		Bank b;
		b=new SBI(); // upcasting
		System.out.println("SBI Rate of Interest is : "+b.getRateofInterest());
		
		b= new HDFC(); // upcasting
		System.out.println("HDFC Rate of Interest is : "+b.getRateofInterest());
	}
}