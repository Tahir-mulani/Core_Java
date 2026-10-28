//1. Payment using Credit Card, UPI, or Net Banking
interface PaymentMethod{
	void pay(double amount);
}
class CreditCardPayment implements PaymentMethod
{
	public void pay(double amount)
	{
		System.out.println("Paid "+amount+" By Credit Card Payment");
	}
}
class UPIPayment implements PaymentMethod
{
	public void pay(double amount)
	{
		System.out.println("Paid "+amount+" By UPI Payment");
	}
}
class NetBankingPayment implements PaymentMethod
{
	public void pay(double amount)
	{
		System.out.println("Paid "+amount+" By Net Banking Payment");
	}
}
class PaymentService
{
	void makePayment(PaymentMethod method,double amount)
	{
		method.pay(amount);
	}
}
public class PayementAPP
{
	public static void main(String x[])
	{
		 
		PaymentMethod method = new UPIPayment();
		new PaymentService().makePayment(method,500);
	}
}