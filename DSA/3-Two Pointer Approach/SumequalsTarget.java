/*1.Sum of Two Numbers Equals Target
Given a sorted array and a target, check if there are two numbers that sum up to the target.
*/
import java.util.Scanner;
public class SumequalsTarget
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		
		System.out.println("enter Array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter target");
		int target=sc.nextInt();
		 
		boolean flag=false;
		int first=0,second=(a.length-1);
		while(first<a.length && second>=0)
		{
			int sum=a[first]+alss[second];
			if(sum==target)
			{
				flag=true;
				break;
			}
			else if(sum>target) 
			{
				
				second--;
			}
			else
			{
				first++;
			}
			
		}
		if(flag)
		{
			System.out.println("found");
		}
		else{
			System.out.println("not found");
		}
	}
}