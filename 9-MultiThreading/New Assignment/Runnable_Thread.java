/* 
Q2. Create two threads using the Runnable interface.
 Each thread should print "Task is running" five times.
Input :- No input.
Output :- Message printed multiple times by both threads.
	Thread-A : Task is running
Thread-B : Task is running
Thread-A : Task is running
Thread-B : Task is running

 */
class A implements Runnable
{	
	public void run(){
			try{
				for(int i=1;i<5;i++)
				{
					System.out.println(Thread.currentThread().getName()+" A- Task is Running");
					Thread.sleep(1000);
				}
				
			}catch(Exception e)
			{
				System.out.println("Error is ----> "+e);
			}
	}
}
class B implements Runnable
{
	public void run(){
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"B -Thread is running");
		}
	}
}
public class Runnable_Thread
{
	public static void main(String x[])
	{
		A a = new A();
		Thread t = new Thread(a);
		
		B b = new B();
		Thread t1 = new Thread(b);
		
		t.start();
		t1.start();
	}
}
