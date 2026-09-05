class Person
{
	String name;
}
public class DemoAPP
{
	static void change(Person p)
	{
		p = new Person();
		p.name = "Bob";
	}
	
	public static void main(String x[])
	{
		Person person = new Person();
		person.name ="Alice";
		change(person);
		 System.out.println(person.name);
	}
}