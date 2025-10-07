/*
**10. Student Marks Entry**

**Description:**

* Keep asking for student marks in a do-while loop.
* If marks are negative, **continue** to skip and ask again.
* If "stop" is entered, **break**.
* Finally, display average marks of valid entries.
*/

import java.util.Scanner;
public class StudentMarksheet
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		String st;
		int total=0,count=0;
		do{
			
			System.out.println("Enter Marks (or stop to finish):");
			st=sc.nextLine();
			
			
			if(st.equalsIgnoreCase("stop")==true){
				break;
			}
			
			int mark=Integer.parseInt(st);
			
			if(mark<0)
			{
				System.out.println("negative marks not allow");
				continue;
			}
			
			total+=mark;
			count++;
			
			
		}while(true);
		if(count>0)
		{
			double average=(float)total/count;
			System.out.println("Average marks:"+average);
		}
		else
		{
			System.out.println("No valid marks enetered");
		}
	}
}
						
					
			
				