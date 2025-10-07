//Q16. Write a java program to find power of a number.
import java.util.*;
public class Q16Power_APP
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int base,index,p=1;
  System.out.println("enter base and index from keyboard");
  base=sc.nextInt();
  index=sc.nextInt();
  while(index!=0)
  {
    p=p*base;
	--index;
  }
  System.out.println("power of number: "+p);
 }
}