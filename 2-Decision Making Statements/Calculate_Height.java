//Q.26
import java.util.*;
public class Calculate_Height
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int h;
  System.out.println("enter height of person");
  h=sc.nextInt();
  if(h<150.0)
  {
   System.out.println("The Person is Dwarf");
  }
  else if(h>=150.0 && h<165.0)
  {
   System.out.println("The person is average");
   }
  else if(h>=165.0 && h<=195.0)
  {
   System.out.println("The person is taller");
  }
  else
  {
	System.out.println("Invalid height");
   }
 }
}