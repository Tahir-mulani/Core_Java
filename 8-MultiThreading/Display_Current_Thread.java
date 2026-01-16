//Q2. Create a thread by implementing Runnable interface and display thread names.
class Names implements Runnable
{
	public void run()
	{
		try{
		System.out.println(Thread.currentThread().getName());
		}catch(Exception ex){
			System.out.println("Error is "+ex);
		}
	}
}
public class Display_Current_Thread
{
	public static void main(String x[])
	{	
		Names n = new Names();
		Thread t = new Thread(n);
		n.run();
	}
}