/*
Q9.Implement a program to calculate product discounts based on price using POJO class and a separate service class for logic.
Requirements:
1. POJO Class – Product
	• Fields (private):
		o int productId
		o String productName
		o double price
	• Methods:
		o Public getter and setter methods for each field.
	• Note: Do not use a constructor; values must be set using setters.
2. Logic Class – ProductService
	• Method 1: calculateDiscount(Product p)
		o Calculates discount based on the product price:
			▪ Price ≥ 1000 → Discount = 20% of price
			▪ 500 ≤ Price < 1000 → Discount = 10% of price
			▪ Price < 500 → Discount = 5% of price
		o Returns the discount amount.
	• Method 2: displayProductDetails(Product p)
		o Displays:
			▪ Product ID
			▪ Product Name
			▪ Price
			▪ Calculated Discount
			▪ Final Price after discount (Price − Discount) 
3. Main Method Instructions:
	1.Create a Product object.
	2.Assign values to the object using setter methods.
	3.Use ProductService to:
		o Calculate discount using calculateDiscount().
		o Display product details using displayProductDetails().
*/
import java.util.Scanner;
class Product
{
	private int productId;
	private String productName;
	private double price;
	
	public void setId(int productId)
	{
		this.productId=productId;
	}
	public int getId()
	{
		return productId;
	}
	public void setName(String productName)
	{
		this.productName=productName;
	}
	public String getName()
	{
		return productName;
	}
	public void setprice(double price)
	{
		this.price=price;
	}
	public double getprice()
	{
		return price;
	}
}
class ProductService
{
	public double calculateDiscount(Product p)
	{
		double discount;
		if(p.getprice()>=1000)
		{
			discount = p.getprice()*20/100;
		}
		else if(p.getprice()>=500 && p.getprice()<1000)
		{
			discount = p.getprice()*10/100;
		}
		else
		{
			discount = p.getprice()*5/100;
		}
		return discount;
	}
	
	public void displayProductDetails(Product p)
	{
		 double discount = calculateDiscount(p);
        double finalPrice = p.getprice() - discount;

        System.out.println("\n--------------------- Product Details -----------------------");
        System.out.printf("%-15s %-20s %-10s %-10s %-12s%n",
                "Product ID", "Product Name", "Price", "Discount", "Final Price");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-15d %-20s %-10.2f %-10.2f %-12.2f%n",
                p.getId(), p.getName(), p.getprice(), discount, finalPrice);
        System.out.println("---------------------------------------------------------------");
	}
		
}
	

public class Q9POJOProductAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		System.out.println("Enter Product Id");
		int productId =sc.nextInt();
		p.setId(productId);
		sc.nextLine();
		
		System.out.println("Enter Product Name");
		String productName=sc.nextLine();
		p.setName(productName);
		
		System.out.println("Enter Product Price");
		double price=sc.nextDouble();
		p.setprice(price);
		
		ProductService pd = new ProductService();
		
		pd.calculateDiscount(p);
		pd.displayProductDetails(p);
		
		
		
	}
}
