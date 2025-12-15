//WAP to create ArrayList and store 5 employee class objects in it and sort data using Collections class.
import java.util.*;
 
class Employee implements Comparable
{
	private int id;
	private String name;
	private int sal;
	public Employee(){
	
	}
	public Employee(String name,int id,int sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getSal()
	{
		return sal;
	}
	public void setSal()
	{
		this.sal=sal;
	}
	
	public int compareTo(Object o)
	{
		Employee emp = (Employee)o;
		if(this.id>emp.id)
		{
			return 1;
		}
		else if(this.id<emp.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	/*
	-->OR<--
	public int compareTo(Object o)
	{
		Employee emp = (Employee)o;
		return this.id > emp.id? : this.is < emp.id? -1 : 0;
	}
	*/
}
public class CollectionsSortEmployeeAPP
{
	public static void main(String x[])
	{
		List list = new ArrayList();
		Employee emp1 = new Employee("ABC",1,1000);
		Employee emp2 = new Employee("MNO",3,5000);
		Employee emp3 = new Employee("PQR",2,2000);
		Employee emp4 = new Employee("STV",5,9000);
		Employee emp5 = new Employee("XYZ",4,8000);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		System.out.println("Before sorting employee data");
		for(Object obj:list)
		{
			Employee e = (Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		Collections.sort(list);
		
		System.out.println("After sorting employee data");
		for(Object obj:list)
		{
			Employee e = (Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
	}
}