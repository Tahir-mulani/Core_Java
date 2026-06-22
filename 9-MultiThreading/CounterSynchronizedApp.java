class Counter
{
	private int count =0;
	
	public void increment()
	{
	
		System.out.println(Thread.currentThread().getName()+" Some other work");
		
		//Non-critical code
		synchronized(this)
		{
			System.out.println(Thread.currentThread().getName()+" aquired lock");
			
			try{
				
			Thread.sleep(3000);
			}
			catch(Exception e)
			{
					System.out.println(Thread.currentThread().getName()
                    + " count = " + count);

            System.out.println(Thread.currentThread().getName()
                    + " releasing lock");
			}

        System.out.println(Thread.currentThread().getName()
                + " : More Work");
		}
	}
}
public class CounterSynchronizedApp

{
	public static void main(String x[])
	{
		Counter c = new Counter();
		
		Thread t1  = new Thread(()->{
			
			c.increment();
		},"Thread -1");
		Thread t2  = new Thread(()->{
			
			c.increment();
		},"Thread -2");
		
		t1.start();
		t2.start();

		
	}
}