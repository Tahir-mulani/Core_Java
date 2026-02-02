//Q1. Create a thread by extending Thread class and print numbers from 1 to 5.
class Number extends Thread
{
	public void run()
	{
		try{
			for(int i=1 ;i<=5;i++)
			{
				System.out.println(i);
				 
			}
		}catch (Exception ex){
			System.out.println("Error is "+ex);
		}
	}
}
public class Print_Numbers
{
	public static void main(String x[])
	{
		Number n = new Number();
		n.start();
	}
}