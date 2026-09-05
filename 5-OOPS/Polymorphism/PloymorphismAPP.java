class Animal
{
	void eat()
	{
		System.out.println("eating");
	}
}
class Dog  
{
	Animal a = new Animal();
	Dog(Animal a)
	{
		this.a=a;
	}
	
	 
}
public class PloymorphismAPP
{
	public static void main(String x[])
	{	
		Animal a = new Animal();
		Dog d = new Dog(a);
		d.eat(); 
	}
}