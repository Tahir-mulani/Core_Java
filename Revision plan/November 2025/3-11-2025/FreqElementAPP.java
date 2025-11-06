/*
3.Count Frequency of Each Element
Concept: Use nested loops or a hash map to count how often each number appears.
 Example:  arr = [4, 5, 6, 4, 5, 7, 4]
Output:
Element 4 occurs 3 times 
Element 5 occurs 2 times 
Element 6 occurs 1 time 
Element 7 occurs 1 time  
*/
public class FreqElementAPP
{
	public static void main(String x[])
	{
		int arr[] = {4, 5, 6, 4, 5, 7, 4};
		boolean flag[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(flag[i])
			{
				continue;
			}
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					flag[j]=true;
				}
			}
			System.out.println("Element "+arr[i]+" occurs "+count);
		}
	}
}