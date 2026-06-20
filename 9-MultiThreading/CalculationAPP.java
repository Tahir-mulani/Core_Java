class Calculate extends Thread
{
	static int result =0;
	public void run()
	{
		result = 100;
	}
}	
class Result extends Thread
{
	 
	public void run()
	{
		System.out.println("Result is :"+Calculate.result);
	}
}	
public class CalculationAPP 
{
	public static void main(String x[]) throws InterruptedException
	{
		Calculate cal = new Calculate();
		cal.start();
		cal.join();
		
		Result r = new Result();
		r.start();
	}
}