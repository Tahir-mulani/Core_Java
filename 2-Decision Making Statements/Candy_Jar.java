//Q.32
import java.util.*;
public class Candy_Jar
{ public static void main(String x[])
  {  Scanner xyz  = new Scanner(System.in);
      int M,N=10,K=5;
	  System.out.println("Enter candies count");
	  M=xyz.nextInt();
	  if(M>K || M<=0)
	  { System.out.println("Invalid input");
	  }
	  else
	  {
	    System.out.println("Candies server "+M);
		System.out.println("Candies Remain "+(N-M));
	  }
  
  }
}
