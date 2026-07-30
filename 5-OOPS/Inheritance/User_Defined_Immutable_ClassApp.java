//user defined immutable class
class Employee
{
	private final int id;
	private final String name;
	private final String address;
	
	Employee(int id,String name,String address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
}
public class User_Defined_Immutable_ClassApp
{	
	public static void main(String x[])
	{
		Employee emp = new Employee(1,"Aniket","Ahilyanager");
		Employee emp1  = emp;
		
		System.out.println("Display first Object");
		System.out.println("ID : "+emp.getId()+" Name : "+emp.getName()+"\nAddress : "+emp.getAddress());
		
		System.out.println("Display second Object");
		System.out.println("ID : "+emp1.getId()+" Name : "+emp1.getName()+"\nAddress : "+emp1.getAddress());
		
	}
}