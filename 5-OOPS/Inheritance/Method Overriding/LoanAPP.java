class Loan
{
	int year;
	void setTenur()
	{
		year=10;
	}
}
class HomeLoan extends Loan
{
	void setTenur()
	{
		year=30;
	}
	void showHomeLoan()
	{
		System.out.println("Home Loan Period "+year);
	}
}
class CarLoan extends Loan
{
	void setTenur()
	{
		year = 5;
	}
	void showCarLoan()
	{
		System.out.println("Car Loan Period "+year);
	}
}
public class LoanAPP
{
	public static void main(String x[])
	{
		HomeLoan h = new HomeLoan();
		h.setTenur();
		h.showHomeLoan();
		
		CarLoan c = new CarLoan();
		c.setTenur();
		c.showCarLoan();
	}
}