import java.util.*;
class Employee
{	
	private int id;
	private String name;
	private int salary;
	private String department;
	public Employee(int id,String name,String department,int salary)
	{
		this.id=id;
		this.name=name;
		this.department = department;
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
 
	public String getDepartment()
	{
		return department;
	}	
}
class Company
{
	private Employee emp[];
	
	public void addNewEmployee(Employee...emp)
	{
		this.emp = emp;
	}
	
	public void showEmployeeDetails()
	{
		System.out.println("========== Employee Details ===========");
		
		for(int i=1;i<emp.length;i++)
		{			
		System.out.println("Emp Id: "+emp[i].getId());
		System.out.println("Emp Name: "+emp[i].getName());
		System.out.println("Emp Department: "+emp[i].getDepartment());
		System.out.println("Emp Salary: "+emp[i].getSalary());
		}
	}
}
public class EmployeDetailsApplication
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Employee []emp = new Employee[2];
	
		for(int i=1;i<emp.length;i++)
		{
			
			System.out.println("Enter Employee Name");
			String name = sc.nextLine();
			
			System.out.println("Enter Employee Department");
			String department = sc.nextLine();
			System.out.println("Enter Employee Salary");
			int salary = sc.nextInt();
			emp[i] = new Employee(i,name,department,salary);
			sc.nextLine();			
		}
		
		Company c = new Company();
		c.addNewEmployee(emp);
		c.showEmployeeDetails();
	}
}