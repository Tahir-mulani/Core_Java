/*
Q8. Create a class Employee with:
•empId
•empName
•baseSalary
•performanceRating
Create a parameterized constructor and a display() method.
Create another class BonusCalculator with:
•setEmployee(Employee[] arr)
•calculateBonus() → Bonus Rules:
oRating 5 → 25% bonus
oRating 4 → 15% bonus
oRating 3 → 10% bonus
oRating 2 → 5% bonus
oRating 1 → No bonus
*/
import java.util.Scanner;
class Employee
{
	int empId;
	String empName;
	double baseSalary;
	int performanceRating;
	Employee(int empId,String empName,double baseSalary,int performanceRating)
	{
		this.empId=empId;
		this.empName=empName;
		this.baseSalary=baseSalary;
		this.performanceRating=performanceRating;
	}
	public void display()
	{
		System.out.println("Display Employee Details");
		System.out.println("Employee ID : "+empId+"\nEmployee Name: "+empName+"\nEmployee Base Salary: "+baseSalary+"\nPerformance Rating : "+performanceRating);
	}
}
class BonusCalculator
{
	Employee arr[];
	void setEmployee(Employee arr[])
	{
		this.arr=arr;
	}
	public void calculateBonus()
	{
		for(int i=0;i<arr.length;i++)
		{
			Employee e = arr[i];
			double bonus=0;
			if(e.performanceRating==5)
			{
				bonus = e.baseSalary*0.25;
			}
			else if(e.performanceRating==4)
			{
				bonus = e.baseSalary*0.15;
			}
			else if(e.performanceRating==3)
			{
				bonus = e.baseSalary*0.15;
			}
			else if(e.performanceRating==2)
			{
				bonus = e.baseSalary*0.05;
			}
			else
			{
				bonus=0;
			}
			System.out.println("------------------------------------");
			e.display();
			System.out.println("Bonus : "+bonus);			
		}
	}
}
public class Q8EmployeeAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Employee");
		int n = sc.nextInt();
		Employee [] arr = new Employee[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Employee Id:");
			int empId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name:");
			String empName = sc.nextLine();
			
			System.out.println("Enter Employee baseSalary:");
			double baseSalary = sc.nextDouble();
			
			System.out.println("Enter Performance Rating(1-5):");
			int performanceRating = sc.nextInt();
			
			arr[i]=new Employee(empId,empName,baseSalary,performanceRating);
		}
		
		//bonus calculate
		BonusCalculator b = new BonusCalculator();
		b.setEmployee(arr);
		b.calculateBonus();	
	}
}
		
