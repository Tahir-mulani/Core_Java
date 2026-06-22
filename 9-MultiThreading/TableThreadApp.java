class Table
{
	void showTable(int no)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(no*i);
		}
	}
}
class A extends Thread
{
	Table table;
	void setTable(Table table)
	{
		this.table = table;
	}
	
	synchronized public void run() 
	{
		table.showTable(2); 
	}
}
class B extends Thread
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
public class TableThreadApp
{
	public static void main(String x[])
	{
		Table table = new Table();
		A a = new A();
		a.setTable(table);
		a.start(); 
		B b = new B();
		b.setTable(table);
		b.start();
	}
}
		
	