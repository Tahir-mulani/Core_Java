class Mythread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child Thread: "+i);
		}
	}
}
public class JoinExample
{
	public static void main(String x[]) throws InterruptedException
	{
		Mythread t1 = new Mythread();
		
		t1.start(); //start child thread
		
		t1.join(); //Main Thread waits for t1 to finish
		System.out.println("Main thread completed");
	}
}