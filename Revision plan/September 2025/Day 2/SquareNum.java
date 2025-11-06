//2.Write a program using for loop to print the square of numbers from 1 to 10.

public class SquareNum
{
	public static void main(String x[])
	{
		System.out.println("Print square of Number from 1 to 50");
		for(int i=1;i<=10;i++)
		{
			int sq=i*i;
			System.out.printf("%d = %d\n",i,sq);
		}
	}
}