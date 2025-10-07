/*WAP to create function name as int getPow(int base,int index):
this function can accept two values of type integer and calculate its power and return it.*/

import java.util.*;
public class FUNAPP
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		int b,i,res;
		b=sc.nextInt();
		i=sc.nextInt();
		res= getpow(b,i);
		System.out.println(res);
	
	}
	public static int getpow(int base,int index)
	{
		int p=1;
		for(int i=1;i<=index;i++)
		{
			p = p * base;
		}
		
		return p;
	}
}

