 /*
WAP to create Employee POJO class with field id, name and salary and store
3 employee objects in Vector and display it.
*/
import java.util.*;
class Employee
{
	private int id;
	private String name;
	private int sal;
	public Employee(){}
	
	public Employee(String name,int id,int sal){
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public void setId(int id)
	{
		this.id= id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
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
public class EmployeeApplication
{
	public static void main(String x[])
	{
		Vector v = new Vector();		
		
		v.add( new Employee("A",1,10000));
		v.add( new Employee("B",2,20000));
		v.add( new Employee("C",3,30000));
		
		Iterator i = v.iterator();
		
		while(i.hasNext())
		{
			Object obj = i.next();
			Employee e = (Employee)obj;
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
		}
	}
}
		
		