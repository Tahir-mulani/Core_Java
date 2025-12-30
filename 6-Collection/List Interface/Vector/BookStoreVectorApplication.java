// WAP to create Vector and store 5 Book in it and search book by using its id
import java.util.*;
class Book
{
	private int id;
	private String name;
	private String author;
	
	public Book(){}
	public Book(int id,String name,String author)
	{
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String  getName()
	{
		return name;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getAuthor()
	{
		return author;
	}
	
}
public class BookStoreVectorApplication
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector();
		Book b1[] = new Book[2]; //array of reference
		
		for(int i=0;i<b1.length;i++)
		{
			System.out.println("Enter id name and Author");
			int id = sc.nextInt();
			String name = sc.nextLine();
			String author = sc.nextLine();

			
			b1[i] = new Book(id,name,author);
			sc.nextLine();
			v.add(b1[i]);
		}
		
		System.out.println("Display all book data");
		Iterator i = v.iterator();
		
		while(i.hasNext())
		{
			Object obj = i.next();
			Book b = (Book)obj;
			System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor());
		}
		
		System.out.println("Enter id for search");
		int searchId = sc.nextInt();
		i = v.iterator();
		while(i.hasNext());
		{
			Object obj = i.next();
			Book b = (Book)obj;
			
			if(searchId == b.getId())
			{
				System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor());
			}
		}
	}
}	