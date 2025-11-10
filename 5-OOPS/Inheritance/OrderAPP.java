/*
6. Question:
 Create a base class Order with fields orderId and amount.
Subclass CODOrder adds a fixed delivery charge of ₹50.
Subclass OnlinePaymentOrder adds no delivery charge but gives 5% cashback.
 Write a program to calculate the final bill amount using overridden methods.
Explanation:
 Tests overriding with additional logic and conditional calculations in subclasses.
*/
import java.util.Scanner;
class Order
{
	int orderId;
	int amount;
	Order(int orderId,int amount)
	{
		this.orderId=orderId;
		this.amount=amount;
	}
	int CalculateBill()
	{
		return amount;
	}
	void GetBill()
	{
		System.out.println("Order Id: "+orderId);
		System.out.println("Final Bill amount: "+CalculateBill());
	}
		
}
class CODOrder extends Order
{
	CODOrder(int orderId,int amount)
	{
		super(orderId,amount);
	}
	int CalculateBill()
	{
		return amount+50;
	}
}
class OnlinePaymentOrder extends Order
{
	OnlinePaymentOrder(int orderId,int amount)
	{
		super(orderId,amount);
	}
	int CalculateBill()
	{
		return (int)(amount-(amount*0.05));
	}
	
}
public class OrderAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Order id");
		int orderId=sc.nextInt();
		System.out.println("Enter amount");
		int amount=sc.nextInt();
		
		
		CODOrder cod = new CODOrder(orderId,amount);
		System.out.println("---Cash On Delivery---");
		cod.GetBill();
		
		OnlinePaymentOrder online = new OnlinePaymentOrder(orderId,amount);
		System.out.println("---Online Payement Order---");
		online.GetBill();
	}
}