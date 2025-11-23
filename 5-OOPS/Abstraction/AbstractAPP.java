abstract class Employee
{
	abstract void skill();
}
class Developer extends Employee
{
	void skill()
	{
		System.out.println("Need good  in logic and coding with communication");
	}
}
class Cook extends Employee
{
	void skill()
	{
		System.out.println("Cooking skill required");
	}
	
}
public class AbstractAPP
{
	public static void main(String x[])
	{
		Developer d = new Developer();
		d.skill();
		
		Cook c = new Cook();
		c.skill();
	}
}j
