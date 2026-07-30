/*WAP to create Employee class with field id,name and salary and store 5 employee objects in list collection 
and fetch employee data*/
import java.util.*;
import java.util.function.*;
class Employee
{
	private int id;
	private String name;
	private int salary;
	
	public Employee(int id,String name,int salary)
	{
		this.id= id;
		this.name= name;
		this.salary = salary;
	}
	public int getId()
	{
		return id;
	}
	public String  getName()
	{
		return name;
	}
	public int getSalary()
	{
		return salary;
	}
}	
public class Consumer_Employee_Data
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		List<Employee> list= new ArrayList<>();
		
		for(int i=1;i<=2;i++)
		{
			System.out.println("Enter name");
			String name = sc.nextLine();
			System.out.println("Enter salary");
			int salary = sc.nextInt();
			list.add(new Employee(i,name,salary));
			sc.nextLine();
		}
		list.forEach((Employee e)-> System.out.println(e.getId()+"  "+e.getName()+"  "+e.getSalary()));
	}
}