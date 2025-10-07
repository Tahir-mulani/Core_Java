//Q.49
import java.util.*;
public class Course_Enroll
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int a,b,c;
  System.out.println("Input enroll student: ");
  a=sc.nextInt();
  System.out.println("Input capacity of course: ");
  c=sc.nextInt();
  System.out.println("Input already join student: ");
  b=sc.nextInt();
  int total=a+b;
  if(total<=c)
  {
   System.out.println("Yes");
  }
  else
  {
   System.out.println("No");
  }
 }
}