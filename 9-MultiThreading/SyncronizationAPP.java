class Table
{ 
	synchronized void showTable(int no)
	{
		try{
			for(int i=1;i<=10;i++)
			{
				System.out.println(no*i);
				Thread.sleep(1000);
			}
		}catch(Exception e)
		{
			System.out.println("Error is "+e);
		}
	}
}
class Test1 extends Thread
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
class Test2 extends Thread
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
public class SyncronizationAPP
{
	public static void main(String x[])
	{	
		Table t = new Table();
		Test1 t1 =  new Test1();
		t1.setTable(t);
		t1.start();
		
		Test2 t2 = new Test2();
		t2.setTable(t);
		t2.start();
	}
}
		