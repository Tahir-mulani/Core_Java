/*1. Print Even and Odd Numbers Using Two Threads
Description
	Create two threads:
	One thread prints even numbers from 1 to 100.
	Another thread prints odd numbers from 1 to 100.

	Expected Output
	Odd Thread : 1
	Even Thread : 2
	Odd Thread : 3
	Even Thread : 4
	...
	Concepts Tested
	Thread creation
	Synchronization
	wait() and notify()*/
import java.util.*;
class Even extends Thread
{
	public void run()
	{
		try{
			for(int i=1;i<=100;i++)
			{
				if(i%2 == 0)
				{
					System.out.println("Even "+i);
					
				}
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error is "+e);
		}
	}
}
class Odd extends Thread
{
	public  void run()
	{
		try{		
			for(int i=1;i<=100;i++)
			{
				if(i%2 != 0)
				{
					System.out.println("Odd "+i); 
				}
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error is "+e);
		}
	}
}
public class PrintEvenOdd
{
	public static void main(String x[])
	{
		Even even = new Even();
		even.start();
		 
		Odd odd = new Odd();
		odd.start();
	}
}
