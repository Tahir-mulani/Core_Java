//Q.51
import java.util.*;
public class Month_Day
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int month;
  System.out.println("enter month number(1-12)");
  month=sc.nextInt();
  switch(month)
  { 
   case 1:
   System.out.println("month is January and Day: 31");
   break;
   case 2:
    int year;
    System.out.println("enter year");
    year=sc.nextInt();
    if(year%4==0)
    {
     System.out.println("month is February and day: 29");
    }
    else
    {
     System.out.println("month is February and day: 28");
    }
   break;
   case 3:
   System.out.println("month is March and Day: 31");
   break;
   case 4:
   System.out.println("month is April and Day: 30");
   break;
   case 5:
   System.out.println("month is May and Day: 31");
   break;
   case 6:
   System.out.println("month is June and Day: 30");
   break;
   case 7:
   System.out.println("month is July and Day: 31");
   break;
   case 8:
   System.out.println("month is Auguast and Day: 31");
   break;
   case 9:
   System.out.println("month is September and Day: 30");
   break;
   case 10:
   System.out.println("month is October and Day: 31");
   break;
   case 11:
   System.out.println("month is November and Day: 30");
   break;
   case 12:
   System.out.println("month is December and Day: 31");
   break;
   default:
   System.out.println("Invalid Input");
  }
 }
}
	
  