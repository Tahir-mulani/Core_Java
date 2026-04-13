import java.io.*;
class Employee
{	
	private int id;
	private String name;
	private int sal;
	
	public Employee(int id,String name,int sal)
	{
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getSal()
	{
		return sal;
	}
}
public class Serilizable_APP
{
	public static void main(String x[])
	{
		FileOutputStream fout = new FileOutputStream("D:\\July 25\\demo.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		Employee emp = new Employee(1,"Tahir",22000);
		out.writeObject(emp);
		out.close();
		fout.close();
		System.out.println("save...");
		
	}
}