// Q55. Write a java program to display following series :   	5  3  10  6  15  9  20  12  25  15  30  18  35  21  40
public class Q55Cube_Series
{
 public static void main(String x[])
 {
  int n=5,i=1,tab,sum=0;
  while(i<=8)
  {
   tab=n*i;
   System.out.print(tab+" ");
   sum=sum+3;
   System.out.print(sum+" ");
   i++;
  }
 }
}
  
