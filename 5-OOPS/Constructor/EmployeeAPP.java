/*Q1. Problem:
 Create a class Employee with fields:
empId, empName, basicSalary, hra, da, and grossSalary.
Use a parameterized constructor to initialize empId, empName, and basicSalary.
 HRA = 10% of basic, DA = 15% of basic, and Gross = Basic + HRA + DA.
 Display all employee details and salary slip.
Hint: Use constructor to calculate the salary.
Explanation:
 This helps you understand how constructors can perform initial calculations immediately after object creation.
*/
import java.util.Scanner;
class Employee
{
	private int empId;
	private String empName;
	private double basicSalary,hra,da,grossSalary;
	
	public Employee(int id,String name,double bs)
	{
		this.empId=id;
		this.empName=name;
		this.basicSalary=bs;
		hra=0.1*basicSalary;
		da=0.15*basicSalary;
		grossSalary=basicSalary+hra+da;
	}
	public void display()
	{
		System.out.println("employee details");
		System.out.println("Name: "+empName+" \nID: "+empId+" \nHRA: "+hra+" \nDA:" +da+" \nGross Salary:" +grossSalary);
	}
}
public class EmployeeAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String name =sc.nextLine();
		System.out.println("Enter Basic Salary");
		double bs=sc.nextDouble();
		Employee emp = new Employee(id,name,bs);
		emp.display();
	}

}
 
