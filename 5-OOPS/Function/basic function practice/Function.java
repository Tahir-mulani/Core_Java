import java.util.*;
public class Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int r[] =getvalue(5);
		System.out.printf("result is %d\t%d",r[0],r[1]);
		
	}
	public static int [] getvalue(int val)
	{
		int a[] =new int [2];
		int sq = val*val;
		int cb= val*val*val;
		a[0]=sq;
		a[1]=cb;
		return a;
	}
}