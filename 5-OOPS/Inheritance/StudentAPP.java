/*
4. Question:
 Create a class Student with fields name and marks. Create subclass EngineeringStudent and MedicalStudent.
If marks >= 50, student passes. Otherwise fails.
 Display results for both types of students using an overridden method.


Explanation:
 This tests inheritance for common fields and customized result display logic.
*/

import java.util.Scanner;
class Student
{
	String name;
	int marks;
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	boolean getResult()
	{
		return marks>=50;
		
	}
	void displayResult()
	{
		System.out.println("Student name: "+name);
		if(getResult())
		{
			System.out.println("Student name: "+name+"\nStudent is Pass");
		}
		else
		{
			System.out.println("Student is Fail");
		}
	}			
		
}
class EngineeringStudent extends Student
{
	EngineeringStudent(String name,int marks)
	{
		super(name,marks);
	}
	/*
	boolean getResult()
	{
		if(marks>=50)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	*/
	void displayResult()
	{
		super.displayResult();
	}			
}
class MedicalStudent extends Student
{
	MedicalStudent(String name,int marks)
	{
		super(name,marks);
	}
	boolean getResult()
	{
		if(marks>=50)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class StudentAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("------>Engineering Student<------");
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter Marks");
		int marks=sc.nextInt();
		System.out.println("----Details ----");
		EngineeringStudent eng = new EngineeringStudent(name,marks);
		eng.displayResult();
		sc.nextLine();
		
		System.out.println("------>Medical Student<------");
		System.out.println("Enter Name");
		name = sc.nextLine();
		System.out.println("Enter Marks");
		marks=sc.nextInt();
		System.out.println("----- Details ----");
		MedicalStudent md = new MedicalStudent(name,marks);
		md.displayResult();	
	}
}