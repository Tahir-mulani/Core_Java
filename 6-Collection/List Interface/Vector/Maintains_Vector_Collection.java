/*Write a program that maintains a Vector of city names. Perform the following:
1.Insert 5 cities.
2.Remove the city at index 3.
3.Insert a new city at index 1.
4.Display final list.*/
import java.util.*;
public class Maintains_Vector_Collection
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		Vector<String> v = new Vector<>();
		
		boolean result = false;
		int choice;
		do{
			System.out.println("------------- MENU ------------");
			System.out.println("1.Insert 5 cities.");
			System.out.println("2.Remove the city at index 3");
			System.out.println("3.Insert a new city at index 1.");
			System.out.println("4.Display final list.");
			System.out.println("5.Exit");
			
			System.out.println("Enter choice");
			choice = sc.nextInt();
			sc.nextLine();
			
			
			switch(choice)
			{
				case 1:
					
					System.out.println("----> Enter 5 cities <----");
					
					for(int i=0;i<5;i++)
					{
						v.add(sc.nextLine());
					}
					break;
				case 2:
					System.out.println("Enter index for removing ");
					int index = sc.nextInt();
					if(v.size()> index)
					{
						v.remove(index);
						System.out.println("City removed Successfully..!");
					}	
					else
					{
						System.out.println("City not found..!");
					}
					break;
					
				case 3:
				
					System.out.println("---> Enter new city <---");
					String city = sc.nextLine();
					v.add(1,city);
					 System.out.println("City Added Successfully...!");
				
					break;
				
				case 4:
					System.out.println("-----> Final List <-----");
					Iterator<String> i = v.iterator();
					while(i.hasNext()){
						Object obj = i.next();
						System.out.println(obj);
					}
					break;
				
				case 5:
					System.out.println("Thank you for Visiting...!");
					break;
					
				default: 
					System.out.println("Wrong choice");
					continue;
							
				
			}
			
		}while(choice != 5);
	}
}
			
		