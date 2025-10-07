/*
8. Vehicle Fuel Efficiency
Task:
 Create a Vehicle class with fields: model, mileage, and fuelCapacity.
 In the main method:
Create a Vehicle object.
Calculate how far the vehicle can travel (mileage * fuelCapacity) and print the result.
Explanation:
 This reinforces using object fields for calculations.
*/

import java.util.Scanner;
class Vehicle 
{
	private String model;
	private double mileage,fuelCapacity;
	
	public void setModel(String m)
	{
		model = m;
	}
	public String getModel()
	{
		return model;
	}
	
	public void setMileage(double ml)
	{
		mileage = ml;
	}
	public double getMileage()
	{
		return mileage;
	}
	
	public void setFuelCapacity(double fc)
	{
		fuelCapacity = fc;
	}
	public double getFuelCapacity()
	{
		return fuelCapacity;
	}
}

public class VehicleFuelEfficiencyAPP
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		
		Vehicle v1 = new Vehicle();
		
		System.out.println("Enter Vehicle Model");
		String model = sc.next();
		v1.setModel(model);
		
		System.out.println("Enter Mileage of Vehicle");
		double mileage=sc.nextDouble();
		v1.setMileage(mileage);
		
		System.out.println("Enter Fuel Capacity of the Vehicle");
		double fuelCapacity = sc.nextDouble();
		v1.setFuelCapacity(fuelCapacity);
		System.out.println("------->Result<-------");
		System.out.println("Vehicle Model: "+v1.getModel());
		System.out.println("Mileage: "+v1.getMileage()+" Fuel Capacity: "+v1.getFuelCapacity()+" km/l");
		double result = (v1.getMileage()*v1.getFuelCapacity());
		System.out.println("vehicle can travel "+result+" km");
	}
}