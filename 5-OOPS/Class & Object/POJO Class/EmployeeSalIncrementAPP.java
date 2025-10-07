/*
2. Employee Salary Increment
Task:
 Create an Employee class with fields: name, salary, and department.
 In the main method:
Create an Employee object.
Increase the employee's salary by 10% and print the updated salary.
Explanation:
 This introduces instance variable manipulation and basic arithmetic operations.
*/

import java.util.Scanner;
//single employee details
class Employee
{
	//provide encapsulation.
	private String name,department;
	private int salary;
	
	//setter getter method
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public void  setDepartment(String d)
	{
		department=d;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setSalary(int s)
	{
		salary=s;
	}
	public double  getSalary()
	{
		return salary;
	}
}

//class hold multipple employee and their salaries.
class Update
{
	private Employee emps[];                   //array hold employee objects
	
	public void inputEmployee(Employee...emp)         //accept variable number of employee objects and stores them.
	{
		emps=emp;
	}
	
	public void displaySalary()      //display salary after 10% increment.
	{
		System.out.println("\n------>Details of Employee<-----------\n");
		for(int i=0;i<emps.length;i++)
		{
			System.out.println("Name of the Employee: "+emps[i].getName()+"\nDepartment of Employee: "+emps[i].getDepartment()+"\nSalary of Employee: "+emps[i].getSalary());
			System.out.println("After Increment the Salary by 10%: "+(emps[i].getSalary()+(emps[i].getSalary()*0.10)));            //calculate salary after 10% increment
			System.out.println();
		}			
			
	}
}

public class EmployeeSalIncrementAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		//creating employee objects.
		System.out.println("Enter Number of Employee");
		int n = sc.nextInt();
		Employee em[] = new Employee[n];
		
		String name="";
		String department="";
		int salary=0;
		for(int i=0;i<em.length;i++)
		{
			em[i] = new Employee();
			System.out.println("Enter Employee Name");
			name=sc.next();
			em[i].setName(name);
			
			System.out.println("Enter Employee Department");
			department=sc.next();
			em[i].setDepartment(department);
			
			System.out.println("Enter Employee Salary");
			salary=sc.nextInt();
			em[i].setSalary(salary);
		}
		
			Update up = new Update();    //create object of update class.	
			up.inputEmployee(em);
			up.displaySalary();
		
		
		
	}
}