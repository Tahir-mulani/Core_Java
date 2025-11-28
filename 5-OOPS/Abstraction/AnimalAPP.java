//Abstract class Animal → methods eat() & sound() implemented in child classes.
abstract class Animal
{
	abstract void eat();
	abstract void sound();
}
class Cat extends Animal
{
	void eat()
	{
		System.out.println("Cat eat Fish");
	}
	void sound()
	{
		System.out.println("Cat Sound is Mewwow");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("Dog eats Bone");
	}
	void sound()
	{
		System.out.println("Dog Sound:Bark");
	}
}
public class AnimalAPP
{
	public static void main(String x[])
	{
		 Animal a;
		 a=new cat();   // upcasting
		 a.eat();           
		 a.sound();
		 
		 a=new Dog();    // upcasting
		 a.eat();
		 a.sound();
	}
}
