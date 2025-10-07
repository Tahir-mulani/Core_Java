//Q14
import java.util.*;
public class Gross_Salary
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int bs,da,hra;
  System.out.println("Enter base salary");
  bs=sc.nextInt();
  if(bs<=10000)
  {
   hra=bs*20/100;
   da=bs*80/100;
   }
   else if(bs<=20000)
   {
    hra=bs*25/100;
	da=bs*90/100;
    }
   else
   {
    hra=bs*30/100;
	da=bs*95/100;
	}
	int total=bs+hra+da;
	System.out.println("Gross Salary is"+total);
  }
 }
	
   