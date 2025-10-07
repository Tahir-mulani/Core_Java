//Q19. Write a java program to find prime number of a array.

import java.util.Scanner;
public class ArrAppQ19
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		int a[]= new int[5];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//find prime number logic
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=1;j<=a[i];j++)
			{
				if((a[i]%j)==0)
				{
					count++;
				
				}
			}
			
			if(count==2)
			{
				System.out.printf("%d\t",a[i]);
			}
			else
			{
				System.out.printf("-------");
			}
			
			
			
		}
	}
}
			
		