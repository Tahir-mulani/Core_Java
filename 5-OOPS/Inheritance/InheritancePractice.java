class Parent
{
	void Statement()
	{
		System.out.println("This is Parent class");
	}
}
class Child extends Parent
{	
	void Statement()
	{	
		System.out.println("This is child class");
	}
	
}
public class  InheritancePractice
{
	public static void main(String xp[])
	{
		Parent p = new Child();
		p.Statement();
		//p.Statement();
	}
}
		