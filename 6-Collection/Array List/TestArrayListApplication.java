 
import java.util.*;
public class TestArrayListApplication {
	/**
	 * @param args
	 */
	public static void main(String [] args){
		ArrayList list = new ArrayList();
		do {
			System.out.println("1: Add Data");
			System.out.println("2:View Data");
			System.out.println("3:Search Data");
			System.out.println("4:Delete data from ArrayList");
			System.out.println("5:Check The size of ArrayList");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your choice");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter Value in Collection");
				int val =sc.nextInt();
				boolean b = list.add(val);
				if(b) {
					System.out.println("Value added in collection");
				}
				else{
					System.out.println("Value not added in collection");
				}
				break;
			case 2:
				for(Object obj:list) {
					System.out.println(obj);
				}
				break;
			case 3:
				System.out.println("Enter Data for Search");
				int data = sc.nextInt();
				b=list.contains(data);
				if(b) {
					System.out.println("Data found");
				}
				else {
					System.out.println("Data not found");
				}
				break;
			case 4:
				System.out.println("Enter Data for Delete");
				data = sc.nextInt();
				int index =list.indexOf(data);
				if(index!=-1) {
					list.remove(index);
					System.out.println("Data deleted");
				}
				else {
					System.out.println("Data not found");
				}
				break;
			case 5:
				int size = list.size();
				System.out.println("Size of ArrayList : "+size);
				break;
			default:
				System.out.println("Wrong choice");
			}
		}while(true);
	}
}
