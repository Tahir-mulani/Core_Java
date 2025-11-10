/*
9. Question:
 Create base class Product with fields id, name, and basePrice.
LuxuryProduct adds 20% tax.
EssentialProduct adds 5% tax.
 Write a program to print final price using polymorphism.
Explanation:
 Tests inheritance where logic changes depending on product type.
*/
import java.util.Scanner;
class Product
{
	int id;
	String name;
	int basePrice;
	Product(int id,String name,int basePrice)
	{
		this.id=id;
		this.name=name;
		this.basePrice=basePrice;
	}
	int getFinalPrice()
	{
		return basePrice;
	}
	void finalPrice()
	{
		System.out.println("id : "+id+"\nName: "+name+"\nFinal Price: "+getFinalPrice());
	}
}
class LuxuryProduct extends Product
{
	LuxuryProduct(int id,String name,int basePrice)
	{
		super(id,name,basePrice);
	}
	int getFinalPrice()
	{
		return (int)((basePrice+(basePrice*0.20)));
	}
}	
class EssentialProduct extends Product
{
	EssentialProduct(int id,String name,int basePrice)
	{
		super(id,name,basePrice);
	}
	int getFinalPrice()
	{
		return (int)((basePrice+(basePrice*0.05)));
	}
}
public class ProductDetailAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("---For Luxury Product---");
		System.out.println("Enter Id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter Base Price");
		int basePrice=sc.nextInt();
		LuxuryProduct lxProduct = new LuxuryProduct(id,name,basePrice);
		System.out.println("=============================");
		System.out.println("After Adding tax");
		lxProduct.finalPrice();
		
		
		System.out.println("---For Essential Product---");
		System.out.println("Enter Id");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		name=sc.nextLine();
		System.out.println("Enter Base Price");
		basePrice=sc.nextInt();
		EssentialProduct esProduct = new EssentialProduct(id,name,basePrice);
		System.out.println("==============================");
		System.out.println("After Adding tax");
		esProduct.finalPrice();
		
	}
}