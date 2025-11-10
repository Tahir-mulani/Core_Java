/*
10. Question:
 Create base class Employee with method calculateBonus().
PermanentEmployee bonus = 25% of salary.
ContractEmployee bonus = 10% of salary.
 Print bonus using a common reference to demonstrate runtime polymorphism.
Explanation:
 Tests dynamic method dispatch where base-class reference holds subclass objects.
*/
import java.util.Scanner;
class Employee
{
	double baseSal;
	Employee(double baseSal)
	{
		this.baseSal=baseSal;
	}
	double calculateBonus()
	{
		return 0;
	}
	void getBonus()
	{
		System.out.println("bonus : "+calculateBonus());
	}
}
class PermanentEmployee extends Employ	ee
{
	PermanentEmployee(double baseSal)
	{
		super(baseSal);
	}
	double calculateBonus()
	{
		return baseSal*0.25; //25% bonus
	}
}		
class ContractEmployee extends Employee
{
	ContractEmployee(double baseSal)
	{
		super(baseSal);
	}
	double calculateBonus()
	{
		return baseSal*0.10; //10% bonus
	}
}
public class EmployeeDetailAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base Salary");
		double baseSal=sc.nextDouble();
		Employee emp;
		System.out.println("\n---For Permanent Employee---");
		emp = new PermanentEmployee(baseSal);
		emp.getBonus();
		
		System.out.println("\n---For Contract Employee---");
		emp = new ContractEmployee(baseSal);
		emp.getBonus();
		
	}
}