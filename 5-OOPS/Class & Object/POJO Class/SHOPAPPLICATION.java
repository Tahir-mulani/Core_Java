class Product
{
	private int id;
	private String name;
	private int price;
	private String brand;
	Product(int id,String name,int price,String brand)
	{
		this.id = id;
		this.name = name;
		this.price= price;
		this.brand = brand;
	}
	
	public int getId()
	{
		return id;
	}
	 
	public String getName()
	{
		return name;
	}
	 
	public int getPrice()
	{
		return price;
	} 
	
	public String getBrand()
	{
		return brand;
	}
}
class Shop
{
	private Product p;
	void AddNewProduct(Product p)
	{
		this.p = p;
	}
	
	void showProduct()
	{
		System.out.println("Product Details");
		
		System.out.print("Product id : "+p.getId()+"\nProduct Name : "+p.getName()+"\nPrice : "+p.getPrice()+"\nBrand : "+p.getBrand());
	
	}
}
public class SHOPAPPLICATION
{	
	public static void main(String x[])
	{
		Shop s = new Shop();
		Product prod = new Product(1,"Laptop",50000,"HP");
		s.AddNewProduct(prod);
		s.showProduct();
		  
	}
}
		
		
	

	