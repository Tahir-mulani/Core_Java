/*32. Sort Employee Names in Reverse Order
Description: Sort names from Z to A.*/
import java.util.*;
class Employee
{
	private String name;
	Employee(String name)
	{
		this.name = name;
	}	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}
public class ReverseOrderNames
{
	public static void main(String x[])
	{
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("A"));
		list.add(new Employee("B"));
		list.add(new Employee("C"));
		list.add(new Employee("D"));
		list.add(new Employee("E"));
		
		System.out.println("Before Reversing");
		for(Employee e:list)
		{
			System.out.println(e.getName());
		}
		
		// sort names reverse order
		Collections.sort(list,(e1,e2)->e2.getName().compareTo(e1.getName()));
		System.out.println("After Reversing");
		for(Employee e:list)
		{
			System.out.println(e.getName());
		}
		
	}
}
		