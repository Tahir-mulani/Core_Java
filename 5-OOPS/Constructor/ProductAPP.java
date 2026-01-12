/*
Q4. Problem:
 Create a class Product with fields id, name, and price.
 Implement:
A parameterized constructor to initialize product details.


A copy constructor to copy data from another object.
 Display both objects to confirm the copy works.
Hint:
 Use Product(Product p) to copy fields.
Explanation:
 This question checks understanding of how to duplicate object data using a copy constructor.
*/
import java.util.*;
class Product
{
	private int id;
	private String name;
	private int price;
	Product(int id,String name,int price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	
	
}
class Comapany
{
	Product p;
	Comapany(Product p)
	{
		this.p = p;
	}
	
	public void showDetails(){
		System.out.println("-----> Product Details <-----\nId : "+p.getId()+"\nName : "+p.getName()+"\nPrice : "+p.getPrice());
	}
}		
public class ProductAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter product name");
		String name = sc.nextLine();
		
		System.out.println("Enter price");
		int price = sc.nextInt();
		
		Product p = new Product(id,name,price);
		
		Comapany  c = new Comapany(p);
		
		c.showDetails();
	}
}
		
		
		