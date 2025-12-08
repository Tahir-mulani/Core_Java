class A
{
	void show()
	{
		System.out.println("I am method A");
	}
}
class B extends A
{
	void show()
	{
		super .show();
		System.out.println("I am method B");
	}
}
public class SuperRefAPP
{
	public static void main(String x[])
	{	
		B b= new B();
		b.show();
	}
}