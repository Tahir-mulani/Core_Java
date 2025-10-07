/*
Q5.Count Even and Odd Numbers
Class: ArrayEvenOdd
Functions:
void inputArray(int arr[])
int countEven()
int countOdd()
Logic: Use % 2 == 0 check.
*/


import java.util.Scanner;
class ArrayEvenOdd
{
	int m[];
	void inputArray(int a[])
	{
		m=a;
		
	}
	int countEven()
	{
		int cnteve=0;
		for(int i=0;i<m.length;i++)
		{
			if(m[i]%2==0)
			{			
				cnteve++;
			}
		}
		return cnteve;
	}
	int countOdd()
	{
		int cntodd=0;
		for(int i=0;i<m.length;i++)
		{
			if(m[i]%2!=0)
			{			
				cntodd++;
			}
		}
		return cntodd;		
	}
}

public class CountEveOddApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		ArrayEvenOdd m1= new ArrayEvenOdd();
		m1.inputArray(a);
		
		System.out.println("Even Numbers in Array"+m1.countEven());
		System.out.println("Odd Numbers in Array "+m1.countOdd());
	
		
	}
}
