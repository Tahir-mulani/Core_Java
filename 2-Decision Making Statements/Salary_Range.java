//Q.57
import java.util.*;
public class Salary_Range
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner (System.in);
  int l;
  System.out.println("enter level (1-3)");
  l=sc.nextInt();
   switch(l)
   {
    case 1:
	 System.out.println("Junior and salary range(20000-30000)");
	 break;
	case 2:
	 System.out.println("Mid and salary range(31000-50000)");
	 break;
	case 3:
	 System.out.println("Senior and salary range(51000-80000)");
	 break;
	
	default:
	 System.out.println("Invalid Input"); 
    }
 }
}