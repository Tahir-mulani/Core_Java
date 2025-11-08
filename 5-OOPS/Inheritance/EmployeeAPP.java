/*
1. Question:
 Create a base class Employee with fields name and salary. Create subclasses Manager and Developer.
Manager gets a 20% bonus on salary.Developer gets a 10% bonus.
 Write a program to calculate and display the total salary (base + bonus) for each employee.
Explanation:
 This tests how to use inheritance to share fields/methods and override logic for bonus calculations.
*/
import java.util.Scanner;
class Employee
{
	String name;
	double salary;
	Employee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	double getTotalSalary()
	{
		return salary;
	}
	void  display()
	{
		System.out.println("Name: "+name);
		System.out.println("Base Salary: "+salary);
		System.out.println("Total Salary: "+getTotalSalary());
	}

}
class Manager extends Employee
{
	Manager(String name,double salary)
	{
		super(name,salary);
	}
	double getTotalSalary()
	{
		return salary+(salary*0.2);
	}
}
class Developer extends Employee
{
	Developer(String name,double salary)
	{
		super(name,salary);
	}
	double getTotalSalary()
	{
		return salary+(salary*0.1);
	}

}
public class EmployeeAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter Salary");
		double salary=sc.nextDouble();
	
		Manager m = new Manager(name,salary);
		System.out.println("\nManager Details");
		m.display();
		
		Developer d = new Developer(name,salary);
		System.out.println("\nDeveloper Details");
		d.display();
		
	}
}
	
	
