//Q.29
import java.util.*;
public class Electricity_Bill
{
  public static void main(String x[])
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Electricity Unit Charges : ");
	 double unit = sc.nextDouble();
	 double total = unit*20/100;
	 
	 if(unit <= 50)
	 {
	    System.out.println("Rs. 0.50/unit " + "Total Bill with surCharges : "  + total * 0.50);
	 }
	 else if(unit > 50 && unit <= 150)
	 {  int bill = 25;
        double newUnit = unit - 50;
		double extra = newUnit*0.75;
	    System.out.println("Rs. 0.75/unit " + "Total Bill with surCharges : " + (bill+extra));
	 }
	 else if(unit > 150 && unit <= 250)
	 {  
		int bill = 25+75;
        double newUnit = unit - 150;
		double extra = newUnit*1.20;
	    System.out.println("Rs. 1.20/unit " + "Total Bill with surCharges : " + (bill+extra));
	 }
	 else if(unit > 250)
	 {	
		int bill = 25+75+120;
        double newUnit = unit - 250;
		double extra = newUnit*1.50;
	    System.out.println("Rs. 1.50/unit " + "Total Bill with surCharges : " + (bill+extra));
	 }
	 else
	 {
	   System.out.println("Bill is Dismissed");
	 }
	
	}
}