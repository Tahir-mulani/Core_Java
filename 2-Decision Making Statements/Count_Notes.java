//Q.25
import java.util.*;
public class Count_Notes
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int a;
  int note500=0,note100=0,note50=0,note20=0,note10=0;
  int coin5=0,coin2=0,coin1=0;
  System.out.println("enter amoount");
  a=sc.nextInt();
  if(a>=500)
  {
   note500=a/500;
   a=a-note500*500;
   }
   if(a>=100)
  {
   note100=a/100;
   a=a-note100*100;
   }
   if(a>=50)
  {
   note50=a/50;
   a=a-note50*50;
   }
   if(a>=20)
  {
   note20=a/20;
   a=a-note20*20;
   }
   if(a>=10)
  {
   note10=a/10;
   a=a-note10*10;
   }
   if(a>=5)
  {
   coin5=a/5;
   a=a-coin5*5;
   }if(a>=500)
  {
   coin2=a/2;
   a=a-coin2*2;
   }if(a>=1)
  {
   coin1=a/1;
   a=a-coin1*1;
   }
   System.out.println("500------>"+ note500);
   System.out.println("100------>"+ note100);
   System.out.println("50------>"+ note50);
   System.out.println("20------>"+ note20);
   System.out.println("10------>"+ note10);
   System.out.println("5------>"+ coin5);
   System.out.println("2------>"+ coin2);
   System.out.println("1------>"+ coin1);
 }
}
  
   
  