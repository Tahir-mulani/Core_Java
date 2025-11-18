//Q.28Write a Java program to calculate the net salary of an employee,Input: basic salary, HRA %, DA %, and tax %.
import java.util.*;
public class SalEmp
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int bs;
  System.out.println("Enter base salary: ");
  bs= sc.nextInt();
  int da=bs*15/100;
  int hra=bs*15/100;
  int total=bs+da+hra;
  System.out.println("Net Salary of employee is: "+total);
 }
}