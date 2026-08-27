class A
{
	A()
	{
		System.out.println("Constructor block");
	}
	
	{
		System.out.println("Instance block");
	}
	
	static
	{
		System.out.println("static block");
		
	}
	
	public void demo(){
		System.out.println("Method block");
	}
}
public class DemoAPP
{
	public static void main(String x[])
	{	
		A a = new A();
		a.demo();	
	}
}