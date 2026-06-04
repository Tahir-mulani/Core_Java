/*Sort Employee Names Alphabetically
Description: Sort a list of employee names in ascending order.*/
import java.util.*;
class Employee
{
	private String name;
	private int salary;
	public Employee(String name,int salary)
	{
		this.name = name;
		this.salary = salary;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public int getSalary()
	{
		return salary;
	}
}
public class SortNamesAlphabetically
{
	public static void main(String x[])
	{
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("Tahir",40000));
		list.add(new Employee("Aniket",60000));
		list.add(new Employee("Yadnynesh",50000));
		list.add(new Employee("Gokul",80000));
		list.add(new Employee("Omkar",70000));
		list.add(new Employee("Siddharth",85000));
		Collections.sort(list,(a,b) -> a.getName().compareTo(b.getName()));
		
		for(Employee e:list)
		{
			System.out.println(e.getName()+" - "+e.getSalary());
		}
	}
}
