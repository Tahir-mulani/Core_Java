 
class Engine {  
    void start() {  
        System.out.println("Engine started");  
    }  
}
class PetrolEngine extends Engine
{
	void start()
	{
		System.out.println("Petrol Engine Started");
	}
}
class DieselEngine extends Engine
{
	void start()
	{
		System.out.println("Diesel Engine Started");
	}
}
class Car {  
    private Engine engine; 
  
    Car(Engine engine) {  
       this.engine = engine; 
    }  
  
    void drive() {  
        engine.start();  
        System.out.println("Car is moving");  
    }  
}  
  
public class CouplingApp {  
    public static void main(String[] args) { 
		Engine engine = new PetrolEngine();  //runtime polymorphism
        Car myCar = new Car(engine);  
        myCar.drive();  
    }  
}
  /*
class Engine {  
    void start() {  
        System.out.println("Engine started");  
    }  
}  
 
class Car {  
    private Engine engine;   
  
    Car(Engine engine) {  
       this.engine = engine;  
    }  
  
    void drive() {  
        engine.start();  
        System.out.println("Car is moving");  
    }  
}  
  
public class Main {  
    public static void main(String[] args) {
		Engine engine = new Engine();
		
        Car myCar = new Car(engine);  
        myCar.drive();  
    }  
}  */