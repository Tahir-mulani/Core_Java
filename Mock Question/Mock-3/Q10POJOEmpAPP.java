/*
Q10. Implement a program to calculate allowances, deductions, and net salary for employees using a POJO class and a service class.
Requirements:
1. POJO Class – Employee
	• Fields (private):
		o int empId
		o String name
		o double basicSalary
		o double hra (House Rent Allowance)
		o double tax
	• Methods:
		o Getter and setter methods only (do not use constructors).
2. Logic Class – EmployeeService
	• Method 1: calculateAllowances(Employee e)
		o Calculate HRA:
			▪ Basic Salary ≥ 100000 → HRA = 25% of basicSalary
			▪ 50000 ≤ Basic Salary < 100000 → HRA = 20% of basicSalary
			▪ Basic Salary < 50000 → HRA = 15% of basicSalary
	• Method 2: calculateTax(Employee e)
		o Tax deduction based on total salary (basicSalary + HRA):
			▪ ≥ 150000 → Tax = 20%
			▪ 75000 ≤ total < 150000 → Tax = 10%
			▪ < 75000 → Tax = 5%
	• Method 3: displayEmployeeDetails(Employee e)
		o Display: empId, name, basicSalary, HRA, Tax, and Net Salary (basicSalary + HRA − Tax)
3. Main Method Instructions:
	• Create an Employee object and set values using setters.
	• Use EmployeeService to calculate allowances, tax, and display employee details.
*/
import java.util.Scanner;
class Employee
{
	private int id;
	private String name;
	private double basicSalary;
	private double hra,tax;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
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
	public void setBaseSal(double basicSalary)
	{
		this.basicSalary=basicSalary;
	}
	public double getBaseSal()
	{
		return basicSalary;
	}
	public void setHra(double hra)
	{
		this.hra=hra;
	}
	public double getHra()
	{
		return hra;
	}
	public void setTax(double tax)
	{
		this.tax=tax;
	}
	public double getTax()
	{
		return tax;
	}
}
class EmployeeService
{
	public double calculateAllowances(Employee emp)
	{
		double HRA;
		if(emp.getBaseSal()>=100000)
		{
			HRA = emp.getBaseSal()*0.25;
		}
		else if(50000 >= emp.getBaseSal() && emp.getBaseSal()< 100000)
		{
			HRA = emp.getBaseSal()*0.20;
		}
		else
		{
			HRA = emp.getBaseSal()*0.15;
		}
		return HRA;			
	}
	public double calculateTax(Employee e)
	{
		double totalSal=(e.getBaseSal()+calculateAllowances(e));
		double Tax;
		if(totalSal>=150000)
		{
			Tax=totalSal*0.20;
		}
		else if(totalSal>50000 && totalSal<150000)
		{
			Tax=totalSal*0.10;
		}
		else
		{
			Tax=totalSal*0.5;
		}
		
		return Tax;
	}
}
public class Q10POJOEmpAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter Employee id");
		int id=sc.nextInt();
		emp.setId(id);
		sc.nextLine();
		
		System.out.println("Enter Employee Name");
		String name =sc.nextLine();
		emp.setName(name);
		
		System.out.println("Enter basic Salary");
		double basicSalary=sc.nextDouble();
		emp.setBaseSal(basicSalary);
		
		System.out.println("Enter HRA(%)");
		double hra = sc.nextDouble();
		emp.setHra(hra);
		
		System.out.println("Enter tax(%)");
		double tax = sc.nextDouble();
		emp.setTax(tax);
		
		EmployeeService ems = new EmployeeService();
		
		
        double hraCalc = ems.calculateAllowances(emp);
        double taxCalc = ems.calculateTax(emp);
        double netSal = emp.getBaseSal() + hraCalc - taxCalc;

        System.out.println("\n-------------------------------------------------------------");
        System.out.println("                    EMPLOYEE SALARY DETAILS         ");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-12s %-12s %-12s %-12s\n",
                "ID", "Name", "Basic", "HRA", "Tax", "NetSalary");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10d %-15s %-12.2f %-12.2f %-12.2f %-12.2f\n",
                emp.getId(), emp.getName(), emp.getBaseSal(), hraCalc, taxCalc, netSal);
        System.out.println("---------------------------------------------------------------");
		sc.close();

		
	}

}