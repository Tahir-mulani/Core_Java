//Q.38
import java.util.*;
public class Student_Eligibility
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int a,m;
  System.out.println("enter attendence and marks");
  a=sc.nextInt();
  m=sc.nextInt();
  if(a>=75 &&  m>=80 && a<100 && m<100)
  {
   System.out.println("Student Eligible for Scholarship");
  }
  else
  {
   System.out.println("Student not Eligible for Scholarship");
  }
 }
}
  