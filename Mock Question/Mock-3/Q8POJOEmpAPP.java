/*
Q8.Create a POJO class Employee with the following private fields:
 	•int id
	•String name
	•double salary
	Then, perform the following operations without using any constructor:
	1.Use setter methods to assign values to id, name, and salary.
	2.Write a method calculateBonus() that returns a bonus amount based on the employee’s salary as per the given conditions:
		o If salary ≥ 100000 → bonus = 15% of salary
		o If salary ≥ 50000 and < 100000 → bonus = 10% of salary
		o If salary < 50000 → bonus = 5% of salary
	3.Write another method displayEmployeeDetails() that prints:
		o Employee ID
		o Employee Name
		o Salary
		o Bonus (calculated using calculateBonus())
		o Total Compensation (salary + bonus)
	4.In the main method, create an object of Employee,
		o set data using setter methods,
		o call calculateBonus() and displayEmployeeDetails() to show all employee information.
*/
import java.util.Scanner;
class Employee
{
	private int id;
	private String name;
	private int sal;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int  getId()
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
		this.sal=sal;
	}
	public int  getSal()
	{
		return sal;
	}
	
	public  int calculateBonus()
	{
		int bonus;
		if(sal >= 100000)
		{
			bonus=(getSal() * 15) / 100;;
		}
		else if(sal >= 50000 && sal< 100000)
		{
			bonus =(getSal() * 15) / 100;;
		}
		else
		{
			bonus =(getSal() * 15) / 100;;
		}
		
		return bonus;
		
	}
	
	public void displayEmployeeDetails()
	{
		System.out.println("===========================");
		System.out.println("    Employee Details ");
		System.out.println("ID = "+getId()+" \nName =" +getName()+ " \nSalary = " +getSal()+ "\nBonus = "+calculateBonus()+" \nTotal Compensation = "+(getSal()+calculateBonus()));
	}
	

}
public class Q8POJOEmpAPP
{
	public static void main(String x[])
	{
		Employee emp = new Employee();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Employee Details");
		
		System.out.println("Id:");
		int id=sc.nextInt();
		emp.setId(id);
		sc.nextLine();
		
		System.out.println("Name:");
		String name=sc.nextLine();
		emp.setName(name);
		
		
		System.out.println("Salary: ");
		int sal=sc.nextInt();
		emp.setSal(sal);
		
		emp.displayEmployeeDetails();
		emp.calculateBonus();
		
		
		
		
	}
}