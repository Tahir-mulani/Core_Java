/*Q17.Write a java program to check majority element of array.
	1.You are given an array of integers.
		Example: {2, 2, 1, 1, 2, 2, 2}
	2.A majority element is an element that occurs more than n/2 times, where n = size of array.
		If array size = 7 → majority element must appear at least 4 times.
		Example: In {2, 2, 1, 1, 2, 2, 2}, the element 2 appears 5 times → Majority Element = 2.
	3.The program should check if such an element exists.
		If it exists → print the majority element.
		If not → print "No Majority Element".
*/

import java.util.*;
public class ArrAppQ17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[7];
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt(); 
		}
		
		
		//sort the array by function
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		//check 
		int count=1,i,flag=0;
		for(i=0;i<a.length;i++)
		{
			if(i==a.length-1)
			{
				if(count>a.length/2)
				{
					flag=1;
					System.out.println("Majority element is" +a[i]);
				}
			}
			else if((a[i]==a[i+1]))
			{
				count++;
			}
			else
			{
				if(count>(a.length/2))
				{
					flag=1;
					System.out.printf("majority element is:%d",a[i]);
					break;
				}
				count=1;
			}
		}	
		if(flag==0)
		{
			System.out.printf("There is no majority element");
		}
	}
}