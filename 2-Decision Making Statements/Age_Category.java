//Q.35
import java.util.*;
public class Age_Category
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int age;
  System.out.println("Enter age");
  age=sc.nextInt();
  if(age>=60)
  {
   System.out.println("Senior");
  }
  else if(age>=30 && age<60)
  {
   System.out.println("Adult");
   }
   else if(age>=15 && age<30)
   {
    System.out.println("Teenager");
   }
   else if(age<15 && age!=0)
   {
    System.out.println("child");
    }
	else
	{
	 System.out.println("Invalid Age");
	}
 }
}