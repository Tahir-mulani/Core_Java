//Q3. Write a java program to find maximum and minimum number in array.


import java.util.Scanner;
public class ArrAppQ3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("enter array element");
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i]){
				max=a[i];
			}
		}
		System.out.println("Maximum is "+max);
		int min=max;
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i]){
				min=a[i];
			}
		}
		System.out.println("Minimum is "+min);
	}
}
		
			