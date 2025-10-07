//Q19
import java.util.*;
public class Grade_Student
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int m;
  System.out.println("Enter student score");
  m=sc.nextInt();
  if(m>=90 && m<=100)
  {
   System.out.println("Excellent");
   }
   else if(m>=75 && m<90)
   {
    System.out.println("Good");
	}
	else if(m>=50 && m <75)
	{
	 System.out.println("Average");
	 }
	 else if(m<50)
	 {
	  System.out.println("Poor");
	  }
	  else
	  {
		System.out.println("Invalid score");
	  }
	}
}