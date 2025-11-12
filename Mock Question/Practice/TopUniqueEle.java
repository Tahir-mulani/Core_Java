/*
Q8. Write a java program to perform this operation.
• Sort the scores in descending order.
• Print the top 3 highest unique scores.
Sample Input: [78, 90, 90, 86, 85, 92, 70, 92]
Expected Output: 92, 90, 86
*/
import java.util.Scanner;	
public class TopUniqueEle
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length");
		int n=sc.nextInt();
		int arr[]=new int[8];
		System.out.println("enter array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//array sort in descending order.
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		System.out.println("array Descending order");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		
		System.out.println("top 3 highest unique scores.");
		//find three highest scores
		int count=0;
		int last=0;
		for(int i=0;i<arr.length&& count<3;i++)
		{
			if(arr[i]!=last)
			{
				System.out.print(arr[i]+" ");
				last=arr[i];
				count++;
			}
		}
		
		
	}
}