//Q.52
import java.util.*;
public class Calculater
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  
  int a,b,choice;
  System.out.println("enter choice(1-5)");
  choice=sc.nextInt();
  System.out.println("enter two numbers: ");
  a=sc.nextInt();
  b=sc.nextInt();   

  
  
  
  switch(choice)
  {
   case 1:
   
   System.out.println("Addition of two number "+(a+b));
   break;
   case 2:
  
   System.out.println("Substraction of two number "+(a-b));
   break;
   case 3:
   
   System.out.println("Multiplication of two number "+(a*b));
   break;
   case 4:
   
   System.out.println("Division of two number "+(a/b));
   break;
   case 5:
   
   System.out.println("Mod of two number "+(a%b));
   break;
   default:
   System.out.println("Invalid Input");
  }
 }
}
   
   