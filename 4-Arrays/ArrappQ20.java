//Q20. Write a java program to find perfect number of a array.

import java.util.Scanner;
public class ArrappQ20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter Array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
		}
		
		//find perfect number logic
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			int j=1;
			while(j<a[i])
			{
				if((a[i]%j)==0)
				{
					sum=sum+j;
				}
				j++;
			}
			 if(sum==a[i])
			 {
				System.out.printf("%d\t",a[i]);
			}
		}
	}
}