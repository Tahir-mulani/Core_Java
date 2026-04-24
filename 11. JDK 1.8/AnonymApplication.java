//Note: following code demonstrate the interface with generics concept 
@FunctionalInterface
interface Square<T>{
	  T getSquare(T no);
}
public class AnonymApplication
{
	   public static void main(String x[])
	   {
		  System.out.println("Square is "+((Square<Float>)(Float no)->no*no).getSquare(5.5f));
	   }
} 