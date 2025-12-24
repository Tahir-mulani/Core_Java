import java.util.*;
class Employee extends Object
{
	private int id;
	private String name;
	private int sal;
	
	public void setId(int id)
	{	
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSal(int sal)
	{
		this.sal = sal;
	}
	public int getSal()
	{
		return sal;
	}
}
public class EmployeeDetailsVectorAPP
{
	public static void main(String x[])
	{
		Vector v = new Vector();
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Tahir");
		emp.setSal(30000);
		
		v.add(emp);
		
		Iterator i = v.iterator();
		while(i.hasNext())
		{
			Object obj = i.next();
			Employee e = (Employee)obj;
			System.out.print("\nID :"+e.getId()+"\nNAME: "+e.getName()+"\nSalary: "+e.getSal());
		}
	}
}