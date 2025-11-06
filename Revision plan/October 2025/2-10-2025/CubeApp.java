/*Q1. Write a program to create class name as Cube with two methods
void setValue(int x): this function accept number as parameter
int getCube(): this function can calculate a cube of a number and return it.
*/

import java.util.*;
class Cube
{
	int n;
	public void setValue(int x)
	{
		n=x;
	}
	public int getCube()
	{
		int cube=n*n*n;
		return cube;
	}
}
public class CubeApp
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		Cube cd = new Cube();
		cd.setValue(n);
		System.out.println("Cube of " +n+ " is " +cd.getCube());
	}
}
