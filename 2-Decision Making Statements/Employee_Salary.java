//Q.41
import java.util.*;
public class Employee_Salary
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner (System.in);
  int bs,ys,r,hike;
  System.out.println("enter basic salary: ");
  bs=sc.nextInt();
  System.out.println("enter service year: ");
  ys=sc.nextInt();
  System.out.println("enter performance rating (1-5): ");
  r=sc.nextInt();
  if(r>=4 && ys>5)
  {
   hike=bs*20/100;
   System.out.println("hike : "+hike);
  }
  else if(r>=3)
  {
   hike=bs*10/100;
   System.out.println("hike: "+hike);
  }
  else
  {
   hike=bs*5/100;
   System.out.println("hike: "+hike);
  }
  int newsalary=hike+bs;
  System.out.println("New Salary: "+newsalary);
 }
}