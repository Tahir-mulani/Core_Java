/*
Q5. Problem:
 Create a class Book with fields:
bookId, title, author, and price.
Use:
A default constructor to print “Book object created”.

A parameterized constructor with bookId and title.

Another parameterized constructor with bookId, title, author, and price
 that calls the previous constructor using this() (constructor chaining).
Add a method display() to show book details.
Hint:
 Use this(bookId, title) inside the main constructor to reuse initialization logic.
Explanation:
 This question checks understanding of constructor chaining, which helps avoid code duplication inside multiple constructors.
 */
import java.util.*;
class Book
{
	private int bookId;
	private String title;
	private String author;
	private int price;
	
	Book(){
		 
	}
	Book(int bookId,String title){
		 this.bookId = bookId;
		 this.title = title;
	}
	Book(int bookId,String title,String author,int price){
		this(bookId,title);
		this.author = author;
		this.price = price;
	}
	
	
	public int getBookId(){
		return bookId;
	}	
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public int getPrice(){
		return price;
	}
	
	public void display(){
		System.out.println("---> Show Book Details <---\nID : "+getBookId()+"\nTitle : "+getTitle()+"\nAuthor : "+getAuthor()+"\nPrice : "+getPrice());
	}	 
}
public class BookAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book ID");
		int bookId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Book Title");
		String title = sc.nextLine();
		
		System.out.println("Enter Book Author");
		String author = sc.nextLine();
		
		System.out.println("Enter Book Price");
		int price = sc.nextInt();
		sc.nextLine();
		
		Book b = new Book(bookId,title,author,price);
		b.display();
			
	}
}
	