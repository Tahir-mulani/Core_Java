//Q.39
import java.util.*;
public class Commision_Amount
{
 public static void main(String x[])
 {
   Scanner sc=new Scanner(System.in);
   int sa;
   System.out.println("enter Sales Amount");
   sa=sc.nextInt();
   if(sa<5000)
   {
    int com=sa*2/100;
	System.out.println("Commision amount: "+com);
   }
   else if(sa>=5000 && sa<=10000)
   {
    int com=sa*5/100;
	System.out.println("Commision amount: "+com);
   }
   else if(sa>10000)
   {
    int com=sa*10/100;
	System.out.println("Commision amount: "+com);
   }
   else
   {
    System.out.println("No Commision amount");
   }
  }
 }