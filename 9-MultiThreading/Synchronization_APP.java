import java.util.*;
class Counter
{
	int count = 0;
	
	 void increment()
	{
		count++;
	}
}
class MyThread extends Thread
{
	Counter c;
	MyThread(Counter c)
	{
		this.c = c;
	}
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			c.increment();
			 
		}
	}
}
public class Synchronization_APP
{
	public static void main(String x[]) throws Exception
	{
		Counter c = new Counter();
		
		MyThread t1 = new MyThread(c);
		MyThread t2 = new MyThread(c);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Count : "+c.count);
	}
}