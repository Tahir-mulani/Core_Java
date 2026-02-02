//Q3. Demonstrate the use of sleep() method to pause a thread for some time.
class ABC extends Thread
{
	public void run()
	{
		try{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				if(i % 2 == 0)
				{
					sleep(10000);
				}
				else{
					sleep(1000);
				}
				
			}
		}catch(Exception ex){
			System.out.println("Error is "+ex);
		}
	}
		
}
public class Pause_Thread
{
	public static void main(String x[])
	{
		ABC abc = new ABC();
		abc.start();
	}	
		
}