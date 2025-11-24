abstract class Animal
{	
	abstract void sound(); //abstract method(no body)
	
	void sleep() //concrete methood
	{
		System.out.println("Sleeping...");
	}
}
class Dog extends Animal
{
	//override
	void sound()
	{
		System.out.println("Dog barks : woof!");
	}
}
public class SoundApplication
{
	public static void main(String x[])
	{	
		Animal a=new Dog();
		a.sound();
		a.sleep();
	}
}
			

	