// Q54. Write a java program to display following series : 	1  2  4  7  11  16  22  29  37  46.
public class Q54Sum_Series
{
 public static void main(String x[])
 {
  int sum=1,i=0;
  while(i<=9)
  {
   sum=sum+i;
   System.out.print(sum+"\t");
   i++;
   }
  }
 }