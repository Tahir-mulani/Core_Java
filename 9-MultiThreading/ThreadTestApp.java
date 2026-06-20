class A extends Thread
{
	public void run()
	{
		System.out.println("First Child");
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.println("Second Child");
	}

}
public class ThreadTestApp 
{
	public static void main(String x[]) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName());
		A a = new A();
		B b = new B();
		 
		b.setPriority(8);
		a.start();
		b.start();		
		a.join();
		System.out.println("Main Thread Started");
	}
}