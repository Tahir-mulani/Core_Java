abstract class Payement
{
	abstract void pay(double amount);
	
	void receipt(){
		System.out.println("Payement Successful");
	}
}
class CreditCard extends Payement
{
	void pay(double amount){
		System.out.println("Paid "+amount+" using Credit Card");
	}
}
class UPI extends Payement
{
	void pay(double amount){
		System.out.println("Paid "+amount+" using UPI");
	}
}
class PayementAPP
{
	public static void main(String x[])
	{
		Payement p = new UPI();
		p.pay(1000);
		p.receipt();
	 
	}
}