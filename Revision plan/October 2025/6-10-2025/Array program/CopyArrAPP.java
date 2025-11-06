//6. Copy One Array into Another

import java.util.*;
public class CopyArrAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		b=a;
		for(int i=0;i<n;i++)
		{
			System.out.printf("%d ",b[i]);
		}
	}
}
	