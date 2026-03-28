//Write a java program to remove duplicated values from arrays.
import java.util.*;
public class Remove_Duplicate_EleAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter array Element");
		for(int i=0;i<n;i++)
		{			 
			arr[i] = sc.nextInt();
		}
		
		boolean [] visited = new boolean[100];
		for(int i=0;i<arr.length;i++)
		{  
			if(visited[arr[i]])
			{
				System.out.print(arr[i]+" ");
				visited[arr[i]] = true;
			}
		}
	}
}
		/*
			Arrays.sort(arr);
		int i=0;
		while(k<arr.length)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j] != arr[j+1])
				{
					arr[k] =arr[j];
					i++;
				}
			}
			k++;
		}
		
	
		for(int k=0;k<i;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}
}
		/*
		for(int i=0;i<arr.length;i++)
		{
			int cnt =0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{	
					cnt++;
				}
			}
			if(cnt == 1)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}	*/
