/*7. Question:
 Create a class Ticket with method calculatePrice().
MovieTicket has 18% GST.
BusTicket has 5% GST.
 Print ticket price including tax using overridden methods.
Explanation:
 Tests method overriding with percentage-based calculations.
*/
import java.util.Scanner;
class Ticket
{
	int price;
	Ticket(int price)
	{
		this.price=price;
	}
	int getPrice()
	{
		return price;
	}
	void getFinalPrice()
	{
		System.out.println(getPrice());
	}
}
class MovieTicket extends Ticket
{
	MovieTicket(int price)
	{
		super(price);
	}
	@Override
	int getPrice()
	{
		return (int)(price+(price*0.18));
	}
	
}
class BusTicket extends Ticket
{
	BusTicket(int price)
	{
		super(price);
	}
	@Override
	int getPrice()
	{
		return (int)(price+(price*0.05));
	}
}
public class TicketAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter price");
		int price = sc.nextInt();
		
		System.out.println("---Movie Ticket---");
		MovieTicket movie = new MovieTicket(price);
		movie.getFinalPrice();
		
		System.out.println("---Bus Ticket---");
		BusTicket bus = new BusTicket(price);
		bus.getFinalPrice();
	}
}
		