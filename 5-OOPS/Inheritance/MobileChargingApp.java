/*class Charger
{
	void chargeMobile()
	{
		System.out.println("start charging");
	}
}
class FastCharger
{
	void chargeMobile()
	{
		System.out.println("Fast Charging start");
	}
}
class Mobile
{
	Charger charger;
	
	public Mobile(Charger charger)
	{
		charger.chargeMobile();
	}
}*/

class InvalidAgeException
{
	public InvalidAgeException(String message){
			super(message);
	}
}
public class MobileChargingApp
{
	public static void main(String x[])
	{
		//Charger charger = new Charger();
		//Mobile mobile = new Mobile(charger);
		try{
			checkAge(18);
		}
		catch(InvalidAgeException i)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	static void checkAge(int age) throws InvalidAgeException{
		
		if(age<18)
			throw new InvalidAgeException("Age must be greater than 18");
		
		System.out.println("Eligible");
	}
	
	
}
	