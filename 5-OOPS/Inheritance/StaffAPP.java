/*
5. Question:
 Create a base class Staff with a method incrementSalary().
For TeachingStaff, salary increases by 15%.
For NonTeachingStaff, salary increases by 10%.
 Print new salaries using method overriding.
Explanation:
 This tests inheritance with percentage-based calculations in subclasses.
*/
import java.util.Scanner;
class Staff
{
	double salary;
	Staff(double salary)
	{
		this.salary=salary;
	}
	double IncrementSalary()
	{
		return salary;
	}
	void getSalary()
	{
		System.out.println("new Salary = "+ IncrementSalary());
	}
}
class TeachingStaff extends Staff
{
	TeachingStaff(double salary)
	{
		super(salary);
	}
	double IncrementSalary()
	{
		return salary+(salary*0.15);
	}
	

}
class NonTeachingStaff extends Staff
{
	NonTeachingStaff(double salary)
	{
		super(salary);
	}
	double IncrementSalary()
	{
		return salary+(salary*0.10);
	}

}
public class StaffAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary for Teaching Staff: ");
		double salary=sc.nextDouble();
		TeachingStaff t = new TeachingStaff(salary);
		System.out.println("For Teaching Staff-->");
		t.getSalary();
		System.out.println("-----------------------------------------");
		
		System.out.println("Enter salary for Non-Teaching Staff: ");
		salary=sc.nextDouble();
		NonTeachingStaff n = new NonTeachingStaff(salary);
		System.out.println("For Non Teaching Staff -->");
		n.getSalary();
		
		
	}
}