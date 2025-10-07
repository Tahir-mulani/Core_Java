//Q.48
import java.util.*;
public class Credit_Score
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int crdscore;
  System.out.println("Enter Credit Score: ");
  crdscore=sc.nextInt();
  if(crdscore>750)
  {
   System.out.println("Yes,it is possible to access CRED programs");
  }
  else
  { 
   System.out.println("No,it is not possible to access CRED programs");
  }
 }
}