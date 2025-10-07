/*
1. Library Book Management
Task:
 Create a Book class with fields: title, author, and price.
 In the main method:
Create two individual Book objects.
Compare the prices of the two books and print the title of the more expensive book.
Explanation:
 This task teaches object instantiation and accessing instance variables directly to perform comparisons.
 */
 //encapsulation


class Book
{
	
	private int price;
	private String title, author;
	
	public void setTitle(String t)
	{
		title=t;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setAuthor(String a)
	{
		author=a;
	}
	
	public String getAuthor()
	{	
		return author;
	}
	
	public void setPrice(int p)
	{
		price=p;
	}
	
	public int getPrice()
	{
		return price;
	}
}

class Display{
	private Book books[];
	
	public void inputBookDetail(Book ...book){
		books=book;
	}
	
	public void DisplayDetail(){
		Book maxPrice= books[0];
		
		for(int i=0; i<books.length; i++){
			
			if(books[i].getPrice()>maxPrice.getPrice())
			{
				maxPrice=books[i];
			
			}
			
		}
		System.out.println(" Title:"+maxPrice.getTitle()+"\n Author:"+maxPrice.getAuthor()+"\n Price:"+maxPrice.getPrice());
		
		
	}
}


public class LibraryBookManagementAPP
{
	public static void main(String x[])
	{
		
		Display d1=new Display();
			
			Book b1=new Book();
			
			b1.setTitle("C Language");
			b1.setAuthor("Danniels Ritches");
			b1.setPrice(100);
		
			Book b2=new Book();
			
			b2.setTitle("The Story Book");
			b2.setAuthor("Rama Swami");
			b2.setPrice(150);
			
		d1.inputBookDetail(b1,b2);
		d1.DisplayDetail();
		
		
			
	}
}

	