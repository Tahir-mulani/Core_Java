
/*
3. Person Age Verification
Task:
 Create a Person class with fields: name and age.
 In the main method:
Create a Person object.
Check if the person is eligible to vote (age >= 18) and print the result.
Explanation:
 This demonstrates condition checking using instance variables.
 */
 
 
 
 //create a person  pojo class.
 import java.util.Scanner;
 class Person
 {
	 private String name;
	 private int age;
	 
	 public void setName(String n)
	 {
		 name = n; 
	 }
	 public  String getName()
	 { 
		return name;
	}
	 
	 public void setAge(int a)
	 {
		 age = a; 
	 }
	 public  int getAge()
	 {

		 return age;
	 }
 }
 
 //verifiy voting eligibility.
 class Verification
 {
	 private Person per[];
	 
	 public void inputAge(Person...p){per=p;}
	 public void displayResult()
	 {
		 for(int i=0;i<per.length;i++)
		 {
			 if(per[i].getAge()>=18)
			 {
				 System.out.println(per[i].getName()+" is eligible for Vote");
			 }
			 else
			 {
				 System.out.println(per[i].getName()+" is not eligible for Vote");
			 }
		 }
		 
	 }
	 
 }

 public class VoterAgeVerificationAPP
 {
	 public static void main(String x[])
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("--------->fill the persons Name and Age <-----------");
		 Person p1= new Person();
		 System.out.println("Enter User Name");
		 String name=sc.next();
		 p1.setName(name);
		 System.out.println("Enter User Age");
		 int age=sc.nextInt();
		 p1.setAge(age);
		
		 Person p2= new Person();
		 System.out.println("Enter User Name");
		 name=sc.next();
		 p2.setName(name);
		 System.out.println("Enter User Age");
		 age=sc.nextInt();
		 p2.setAge(age);
		 //-----> verify the age of persons <-------
		 Verification v = new Verification();
		 v.inputAge(p1,p2);
		 System.out.println("---------> After Verification <----------");
		 v.displayResult();
		 
		 
	 }
 }