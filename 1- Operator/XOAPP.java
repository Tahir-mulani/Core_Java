import java.util.*;
public class XOAPP
{ 
 public static void main(String x[])
 {
  Scanner sc=new Scanner (System.in);
  int a,b;
  System.out.println("Enter two values: ");
  a=sc.nextInt();
  b=sc.nextInt();
  System.out.printf("before\n");
  System.out.printf("A=%d\tB=%d\n",a,b);
  a=a^b;
  b=a^b;
  a=a^b;
  System.out.printf("after\n");
  System.out.printf("A=%d\tB=%d\n",a,b);
 }
}