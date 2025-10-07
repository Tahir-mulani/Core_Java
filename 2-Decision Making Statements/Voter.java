//Q.12
import java.util.*;
public class Voter
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int age;
  System.out.println("Enter age");
  age=sc.nextInt();
  if(age>18)
  {
   System.out.println("Eligible for her/his own vote");
  }
  else
  {
   System.out.println("Not Eligible for her/his own vote");
  }
 }
}