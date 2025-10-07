//Q.33
import java.util.*;
public class Monkey_Banana_Peanuts
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner (System.in);
  int n,k,j,m,p;
  System.out.println("input values");
  n=sc.nextInt();//Total monkey 20
  k=sc.nextInt();//eat banana by  single monkey 2
  j=sc.nextInt();//eat peanut single monkey 3
  m=sc.nextInt();//total bananas 12
  p=sc.nextInt();//total peanuts 12
  m=m/k;//6
  j=p/j;//4
  int total=n-(m+j);
  System.out.println("Number of Monkeys left on the tree: "+total);
 }
}
  