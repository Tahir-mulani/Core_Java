/*
Q10. Write a Java program to check whether a square matrix is a Magic Square.
Description:
A matrix is called a Magic Square if:
•Sum of all rows is equal
•Sum of all columns is equal
•Both diagonals also have the same sum
*/
import java.util.Scanner;
public class Q10SquareMatrixAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of square matrix");
		int n=sc.nextInt();
		
		int arr[][]=new int[n][n];
		System.out.println("Enter matrix element");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		//calculate sum of first row --->target sum
		int magicsum=0;
		for(int j=0;j<n;j++)
		{
			magicsum=magicsum+arr[0][j];
		}
		
		boolean flag = true;
	   
		//calculate all row sums
	    for(int i=1;i<n;i++)
		{
			int rowSum=0;
			for(int j=0;j<n;j++)
			{
				rowSum=rowSum+arr[i][j];
			}
			if(rowSum!=magicsum)
			{
				flag=false;
				break;
			}
		}
		
		//calculate column sums
		if(flag)
		{
			for(int j=0;j<n;j++)
			{
				int colSum=0;
				for(int i=0;i<n;i++)
				{
					colSum=colSum+arr[j][i];
				}
				if(colSum!=magicsum)
				{
					flag=false;
					break;
				}
			}
		}
		
		//check first diagonal sum
		if(flag)
		{
			int d1=0;
			for(int i=0;i<n;i++)
			{
				d1=d1+arr[i][i];
			}
			if(d1!=magicsum)
			{
				flag=false;
			}
		}
		//check second diagonal sum
		if(flag)
		{
			int d2=0;
			for(int i=0;i<n;i++)
			{
				d2=d2+arr[i][n-1-i];
			}
			if(d2!=magicsum)
			{
				flag=false;
			}
		}
		
		if(flag)
		{
			System.out.println("The matrix is square");
		}
		else
		{
			System.out.println("The matrix is not a magic square");
		}
	}
}
