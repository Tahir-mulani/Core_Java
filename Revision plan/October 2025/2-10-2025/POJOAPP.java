/*Q5. Write program to create POJO class name as Employee with id,name and salary attribute and
store data in object and retrieve data from object
*/

import java.util.*;
//POJO class
class Employee                   
{
	//Attribute.
	int id,salary;
	String name;
	void setId(int i)
	{
		id=i;
	}
	int getId()
	{
		return id;
	}
	void setName(String n)
	{
		name=n;
	}
	String getName()
	{
		return name;
	}
	void setSalary(int s)
	{
		salary=s;
	}
	int getSalary()
	{
		return salary;
	}
	
}
public class POJOAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		//creat object of class.
		Employee emp = new Employee();            
		
		//store data in object
		System.out.println("Enter Id");
		int id=sc.nextInt();
		emp.setId(id);             
	
		sc.nextLine();
		System.out.println("Enter Name");
		String name = sc.nextLine();
		emp.setName(name);
	
		System.out.println("Enter Salary");
		int salary = sc.nextInt();
		emp.setSalary(salary);
		
		System.out.println("Details of Employee");
		
		//retrieve data from object.
		System.out.println("\nID: "+emp.getId()+"\nName: "+emp.getName()+" \nSalary: "+emp.getSalary());    
	}
}