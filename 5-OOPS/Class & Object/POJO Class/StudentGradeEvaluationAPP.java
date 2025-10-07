/*
7. Student Grade Evaluation
Task:
 Create a Student class with fields: name, marks, and subject.
 In the main method:
Create a Student object.
Check if the student has passed or failed the subject (passing marks >= 40) and print the result.
*/

import java.util.Scanner;
class Student
{
	private String name,subject;
	private int marks;
	
	
	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSubject(String s)
	{
		subject = s;
	}
	public String getSubject()
	{
		return subject;
	}
	
	public void setMarks(int m)
	{
		marks = m;
	}
	public int getMarks()
	{
		return marks;
	}
}
public class StudentGradeEvaluationAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		System.out.println("Enter Name of the Student");
		String name = sc.next();
		st.setName(name);
		
		System.out.println("Enter Subject Name");
		String subject = sc.next();
		st.setSubject(subject);
		
		System.out.println("Enter Marks of Student");
		int marks = sc.nextInt();
		st.setMarks(marks);
		
		
		
		System.out.println("--------> Result <--------");
		
		if(st.getMarks()>=40)
		{
			System.out.println("Student get Passed");
		}
		else
		{
			System.out.println("Student get Failed");
		}
	}
}
	
	