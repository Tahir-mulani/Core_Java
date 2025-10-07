//Q.32
import java.util.*;
public class Manufacture_Vehical
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int v,w;
  System.out.println("enter number");
  v=sc.nextInt();//num of vehical
  w=sc.nextInt();//total Wheels
  
  int Fw=(w-2*v)/2;
  int Tw=v-Fw;
  System.out.println("Four Wheeler is = "+Fw);
  System.out.println("Two Wheeler is ="+Tw);
  }
  }
  