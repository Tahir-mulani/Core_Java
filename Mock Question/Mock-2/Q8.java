
import java.util.Scanner;
public class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		//enter array element.
		
		int a[] = {2,1,5,1,3,2};/*
		System.out.printf("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}*/
		
		//enter fixed window size.
		int k=3; //sc.nextInt();
		
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum+=a[i];
			
		}
		System.out.print(sum);
		for(int i=k-1;i<a.length-k;i++)
		{
			
			sum+=a[i];
		}
		Systemout.print(
		
		
	}
}
		
		