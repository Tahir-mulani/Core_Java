/*
6. Food Item Price Comparison
Task:
 Create a FoodItem class with fields: name and price.
 In the main method:
Create two FoodItem objects.
Compare their prices and print the name of the cheaper food item.
Explanation:
 This helps understand comparison logic with custom objects.
*/

import java.util.Scanner;
class FoodItem
{
	private String name;
	private int price;
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(int p)
	{
		price=p;
	}
	public  int getPrice()
	{
		return price;
	}
}

class Cheaper
{
	FoodItem food[]; 
	public void setInput(FoodItem...fd)
	{
		food = fd;
	}
	public void getDisplay()
	{
		int cheapPrice=food[0].getPrice();
		for(int i=0;i<food.length;i++)
		{
			if(food[i].getPrice()<cheapPrice)      //compare with cheap Price
			{
				cheapPrice=food[i].getPrice();
			}
		}
		System.out.println("----------><--------------");
		for(int i=0;i<food.length;i++)
		{
			if(food[i].getPrice()==cheapPrice)        //get the cheap price item name
			{
				System.out.println("Cheaper food Item is "+food[i].getName());
			}
		}
	}
}
public class FoodItemAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Food Items");
		int f = sc.nextInt();
		FoodItem fd[] = new FoodItem[f];
		String name ="";
		int price=0;
		for(int i=0;i<fd.length;i++)
		{
			fd[i]= new FoodItem();
			System.out.println("Enter Name of Food Item");
			name = sc.next();
			fd[i].setName(name);
			
			System.out.println("Enter Price of Food Item");
			price = sc.nextInt();
			fd[i].setPrice(price);
		}
		
		//create object of cheaper class
		Cheaper ch = new Cheaper();
		ch.setInput(fd);
		ch.getDisplay();
	
	}
}