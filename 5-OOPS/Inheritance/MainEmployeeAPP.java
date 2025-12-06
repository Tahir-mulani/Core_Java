import java.util.*;
class Employee
{
	int id;
	float bsal;
	String name;
	Employee(int id,float bsal,String name)
	{
		this.id = id;
		this.bsal = bsal;
		this.name = name;
	}
	void show()
	{
		System.out.println("Name : "+name+" "+bsal);
	}
	void calculateSalary()
	{
		
	}		
}
class Manager extends Employee
{
	int ts;
	Manager(int i,float bs,String n,int teamsize)
	{
		super(i,bs,n);
		ts=teamsize;
	}
	void calculateSalary()
	{
		int bonus=0;
		float allowance = 0.4f*bsal;
		if(ts>10)
		{
			bonus = 10000;
		}
		float gs = bsal+allowance+bonus;
		System.out.println(" Gross Salary = "+gs);
	}
}
class Developer extends Employee
{
	int nop;
	Developer(int i,float bs,String n,int nop2)
	{
		super(i,bs,n);
		nop = nop2;
	}
	void calculateSalary()
	{
		int extrap = 2000*nop;
		float allowance = 0.3f*bsal;
		float gs = bsal+allowance+extrap;
		System.out.println(" Gross Salary = "+gs);
	}
}
public class MainEmployeeAPP
{
	public static void main(String x[])
	{
		int id,teamsize,nop2;
		float bsal;
		String name;
		Scanner sc = new Scanner(System.in);
		Employee e[] = new Employee[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter id,name,basic salary");
			id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name");
			name = sc.nextLine();
			System.out.println("basic salary");
			bsal= sc.nextFloat();
			System.out.println("1.Manager 2.Developer");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter team size");
					teamsize=sc.nextInt();
					e[i]=new Manager(id,bsal,name,teamsize);
					break;
				
				case 2:
					System.out.println("Enter number of projects");
					nop2=sc.nextInt();
					e[i]=new Developer(id,bsal,name,nop2);
					break;
				
				default:
					i--;
					System.out.println("Invalid choice");
			}		
		}
		System.out.println("Record is");
		for(int i=0;i<3;i++)
		{
			e[i].show();
			e[i].calculateSalary();
		}		
	}
}
			
		