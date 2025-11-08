/*
3. Question:
 Create a base class Product with fields id, name, and price. Create subclasses Electronics (10% discount) and Clothing (20% discount).
 Write a program to calculate and print final prices after applying discounts.
Explanation:
 This tests constructor chaining and method overriding for price calculation.
*/

import java.util.Scanner;
class Product
{
	int id;
	String name;
	double price;
	Product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	double CalculatePrice()
	{
		return price;
	}
	void display()
	{
		System.out.println("Price is: "+CalculatePrice());
	}
}
class Electronics extends Electronics
{
	Electronics(int id,String name,double price)
	{
		super(id,name,price);
	}
	double CalculatePrice()
	{
		return price-0.5;
	}
}
class Clothing extends Product
{
	Clothing(int id,String name,double price);
	{
		super(id,name,price);
	}
	double CalculatePrice()
	{
		return price-0.2;
	}
}
public class ProductAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter price");
		double price = sc.nextDouble();
		
		Electronics e = new Electronics(id,name,price);
		System.out.println("\nElectronics Product Details");
		
		
	}
}