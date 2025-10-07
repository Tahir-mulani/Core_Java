/**2. Menu-Driven Calculator**/

/* Display a menu with 4 operations: Add, Subtract, Multiply, Divide.
* Use a do-while loop to keep showing the menu until the user chooses "Exit".
* Use **continue** to skip calculation if the user enters an invalid choice.
* If the user enters "Exit",**break** the loop. */
import java.util.Scanner;
public class MenuDrivenCalculator
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		do{
			System.out.print("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit\n");
			System.out.println("Enter choice");
			int no=sc.nextInt();
			if(no<1 || no>5){
				continue;
			}
			if(no==5){
				System.out.println("Exit");
				break;
			}
			System.out.println("enter two number");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int result;
				switch(no)
				{
					case 1:
					  result=num1+num2;
					  System.out.println("Add is = "+result);
					  break;
					case 2:
					  result=num1-num2;
					  System.out.println("Subtract is = "+result);
					  break;
					case 3:
					  result=num1*num2;
					  System.out.println("Multiply is = "+result);
					  break;
					case 4:
					  result=num1/num2;
					  System.out.println("Divide is = "+result);
					  break;
				}
			
		}while(true);
	}
}
	    