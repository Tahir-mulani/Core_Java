class Table
{
	synchronized void showTable(int no)
	{
		try{
		
			for(int i=1;i<=10;i++)
			{
				System.out.println(i*no);
			}
		} catch(Exception e)
		{
			System.out.println("Error is "+e);
		}
	}
}
class Two extends Thread
{
	Table table;
	
	void setTable(Table table)
	{
		this.table = table;
	}
	
	public void run()
	{
		table.showTable(2);
	}
}
class Three extends Thread
{
	Table table;
	
	void setTable(Table table)
	{
		this.table = table;
	}
	
	public void run()
	{
		table.showTable(3);
	}
}
public class SynchroziedAsynchrozedAPP
{
	public static void main(String x[])
	{	
		Table table = new Table();
		
		Two two = new Two(table);
		two.start();
		Three three = new Three(table);
		three.start();
	}
}
		
	