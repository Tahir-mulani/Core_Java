/*
Q1. Problem Statement :
Write a Java program to design a College Management System using the concept of inheritance.
The system should maintain and process details of both Students and Faculty members.
Use one parent class and two child classes, and perform ten sequential operations related to
student and faculty management.
Class Structure:
1)Parent Class – Person
Data Members:
 int id, String name, String address, String contactNo
Member Methods:
1.addDetails() – Accept and store basic person details.
2.displayDetails() – Display details of a person.
3.updateAddress() – Update the address of a person.
4.updateContact() – Update contact number.
5.showBasicInfo() – Display ID, name, and contact number.

2)Child Class 1 – Student extends Person
	Additional Data Members:
	String courseName, int marks[3], double percentage
	Additional Methods:
6. enterMarks() – Accept marks of three subjects.
7. calculatePercentage() – Calculate and store percentage based on marks.

3)Child Class 2 – Faculty extends Person
	Additional Data Members:
	String subject, double salary, int experience
	Additional Methods:
8. assignSubject() – Assign subject to faculty.
9. calculateIncrement() – Increase salary by 10% if experience is greater than 5 years.
10. displayFacultyInfo() – Display faculty’s subject, salary, and experience.

Operations to Perform (Sequentially):
	Add student details using addDetails() method.
	Enter marks for three subjects using enterMarks().
	Calculate and store the student’s percentage using calculatePercentage().
	Update the student’s contact number using updateContact().
	Display all details of the student using displayDetails().
	Add faculty details using addDetails() method.
	Assign subject to faculty using assignSubject().
	Calculate salary increment for the faculty using calculateIncrement().
	Update the faculty’s address using updateAddress().
	Display complete faculty information using displayFacultyInfo().
Instructions:	
	Use constructors in all classes for initialization.
	Use the super keyword to call parent constructors in child classes.
	Apply method overriding for displayDetails() to show specific outputs for each child class.
	Perform all 10 operations sequentially in the main() method.
	Do not use collections; use arrays or primitive variables only.
*/

import java.util.Scanner;
class Person
{
	Scanner sc = new Scanner(System.in);
	int id;
	String name,address,contactNo;
	Person(int id,String name,String address,String contactNo)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.contactNo=contactNo;
	}
	void addDetails()
	{
		System.out.println("Enter Id");
		id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name");
		name=sc.nextLine();
		
		System.out.println("Enter Address");
		address=sc.nextLine();
		
		System.out.println("Enter Contact Number");
		contactNo=sc.nextLine();
	}
	void displayDetails()
	{
		System.out.println("---Person Details---");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Contact Number: "+contactNo);
	}
	void updateAddress()
	{
		System.out.println("Enter New Address");
		address=sc.nextLine();
		System.out.println("Address Updated Successfully");
		
	}
	void updateContact()
	{
		System.out.println("Enter New Contact Number");
		contactNo=sc.nextLine();
		System.out.println("contact Updated Successfully");
		
	}
	void showBasicInfo()
	{
		System.out.println("\n---Basic Info---");
		System.out.println("Id: "+id);
		System.out.println("name: "+name);
		System.out.println("Contact Numer: "+contactNo);
	}		
		
}
class Student extends Person
{
	String courseName;
	int marks[]=new int[3];
	double percentage;
	Student(int id,String name,String address,String contactNo)
	{
		super(id,name,address,contactNo);
	}
	void enterMarks()
	{
		System.out.println("--Enter 3 subject Marks---");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("subject "+(i+1)+ ": ");
			marks[i]=sc.nextInt();
		}
		sc.nextLine();
		
	}
	void calculatePercentage()
	{
		int sum=0;
		for(int i=0;i<marks.length;i++)
		{
			sum = sum + marks[i];
		}
		
		percentage= sum / 3.0;
	}
	@Override
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Course Name: "+courseName);
		System.out.println("Percentage : "+percentage+"%");
	}
		
		
}
class Faculty extends Person
{
	String subject;
	double salary;
	int experience;	
	Faculty(int id,String name,String address,String contactNo)
	{
		super(id,name,address,contactNo);
	}
	void assignSubject()
	{
		sc.nextLine();
		System.out.println("Enter Subject Name:");
        subject = sc.nextLine();
        
		System.out.println("Enter Salary:");
        salary = sc.nextDouble();
        
		System.out.println("Enter Experience (in years):");
        experience = sc.nextInt();
	}
	void calculateIncrement()
	{
		if(experience>5)
		{
			salary=salary+(salary*0.10);
			 System.out.println("Salary incremented by 10% for experience > 5 years.");
		}
		else
		{
			 System.out.println("No increment (experience <=5 years).");
		}
		
	}
	void displayFacultyInfo()
	{
		System.out.println("---Faculty Details---");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Contact Number: "+contactNo);
		System.out.println("Subject: " + subject);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Salary: " + salary);
	}
		
}public class CollegeManagementSystemAPP
{	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n===== STUDENT SECTION =====");
		Student s = new Student(0,"","","");
		s.addDetails();

		sc.nextLine(); // ensure no leftover newline
		System.out.println("Enter Course Name:");
		s.courseName = sc.nextLine();

		s.enterMarks();
		s.calculatePercentage();
		s.updateContact();

		System.out.println("\n--- Student Details ---");
		s.displayDetails();

		System.out.println("\n-----------------------------------");
		System.out.println("===== FACULTY SECTION =====");
		Faculty f = new Faculty(0,"","","");
		f.addDetails();
		f.assignSubject();
		f.calculateIncrement();
		f.updateAddress();

		System.out.println("\n--- Faculty Details ---");
		f.displayFacultyInfo();

		sc.close();
	}
}
