/*
Q2. Problem:
 Create a class Student with fields rollNo, name, m1, m2, m3, and total.
 Use a parameterized constructor to assign values to roll number, name, and marks.
 Calculate total marks inside the constructor and display details using a function.
Hint: Constructor should perform addition logic.
Explanation:
 Shows how to use constructors to initialize and process multiple fields at once.
*/

import java.util.Scanner;
class Student
{
	private int rollNo;
	private String name;
	private int m1,m2,m3;
	private int total;
	
	public Student(int rollNo,String name,int m1,int m2,int m3)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		total=m1+m2+m3;
	}
	void displayDetails()
	{
		System.out.println("Details of Student");
		System.out.println("Roll No.:" +rollNo+"\nName:" +name+"\nTotal Marks:" +total);
	}

}
public class StudentAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll no");	
		int rollNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter 3 subject Marks");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		
		Student st = new Student(rollNo,name,m1,m2,m3);
		st.displayDetails();
		
	}
}