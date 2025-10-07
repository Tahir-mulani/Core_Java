//Q.27
import java.util.*;
public class Per_Grade
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner (System.in);
  int Physics,Chemistry,Biology,Mathematics,Computer;
  System.out.println("enter subject marks");
  Physics=sc.nextInt();
  Chemistry=sc.nextInt();
  Biology=sc.nextInt();
  Mathematics=sc.nextInt();
  Computer=sc.nextInt();
  int total=Physics+Chemistry+Biology+Mathematics+Computer;
  int per=total/5;
  if(per>=90)
  {
   System.out.println("Grade A");
  }
  else if(per>=80&&per<90)
  {
   System.out.println("Grade B");
  }
  else if(per>=70&&per<80)
  {
   System.out.println("Grade C");
  }
  else if(per>=60&&per<70)
  {
   System.out.println("Grade D");
  }
  else if(per>=40&&per<60)
  {
   System.out.println("Grade E");
  }
  else if(per<40)
  {
   System.out.println("Grade F");
  }
  else
  {
   System.out.println("Invalid Grade");
  }
 }
}
   
  
  