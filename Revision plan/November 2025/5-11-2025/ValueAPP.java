/*
Q1. Write a program to create class name as Value with single function name as setValue(int,int) and we have to create three child classes name as 
Add with function int getAdd() , Mul with function getMul() and Div with function getDiv() and getAdd() function return addition of two value 
which is inherited from Value class , getMul() function return multiplication of two values which is inherited from Value class and gitDiv() 
function return division of two values which Is inherited from Value class.
*/

import java.util.Scanner;
class Value
{
	int a,b;
	void setValue(int x,int y)
	{
		a=x;
		b=y;
	}
}
class Add extends Value
{
	int getAdd()
	{
		return a+b;
	}

}
class Mul extends Value
{
	int getMul()
	{
		return a*b;
	}
}
class Div extends Value
{
	double getDiv()
	{
		if(b==0)
		{
			System.out.println("Division by 0 is not allowed");
			return 0;
		}
		return (double)a/b;
	}
}
public class ValueAPP
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		Add add=new Add();
		add.setValue(x,y);
		System.out.println("Addition is: "+add.getAdd());
		
		
		Mul mul=new Mul();
		mul.setValue(x,y);
		System.out.println("Multiplication is: "+mul.getMul());
		
		Div div=new Div();
		div.setValue(x,y);
		System.out.println("Division is: "+div.getDiv());
		
		
	}
}

