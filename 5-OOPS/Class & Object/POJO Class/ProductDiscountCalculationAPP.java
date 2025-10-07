/*
9. Product Discount Calculation
Task:
 Create a Product class with fields: name, price, and discountPercentage.
 In the main method:
Create a Product object.
Calculate the discounted price and print the result.
Explanation:
 This teaches applying percentages and using object fields.
*/

import java.util.Scanner;
class Product
{
	private String name;
	private int price,discount;
	
	//setter getter method.
	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
	
	public void setPrice(int p)
	{
		price = p;
	}
	public int getPrice()
	{
		return price;
	}
	public void setDiscount(int d)
	{
		discount = d;
	}
	public int getDiscount()
	{
		return discount;
	}
}
public class ProductDiscountCalculationAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Product pd = new Product();
		
		System.out.println("\n----->Enter Product Details<-----\n");

		System.out.println("Enter Product Name");
		String name =sc.next();
		pd.setName(name);
		
		System.out.println("Enter Product Price");
		int price =sc.nextInt();
		pd.setPrice(price);
		
		System.out.println("Enter Product Discount int Percentage");
		int discount =sc.nextInt();
		pd.setDiscount(discount);
		
		System.out.println("------>Result<-------");
		
		int discountAmount = pd.getPrice()*pd.getDiscount()/100;
		int discountPrice =pd.getPrice()-discountAmount;
		System.out.println("The discounted price of the "+pd.getName()+" is "+discountPrice);
	}
}
		
