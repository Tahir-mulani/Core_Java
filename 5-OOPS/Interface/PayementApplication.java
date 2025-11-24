interface Payement
{
	void pay(int amount);
}
class UPI implements Payement
{
	public void pay(int amount)
	{
		System.out.println("Paid using UPI: "+amount);
	}
}
class Card implements Payement
{
	public void pay(int amount)
	{
		System.out.println("Paid using Card: "+amount);
	}
}
public class PayementApplication
{
	public static void main(String x[])
	{	
		Payement p = new UPI();
		p.pay(500);
	}
}