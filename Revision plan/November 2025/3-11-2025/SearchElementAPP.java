/*
2.Search for an Element (Linear Search)
Concept: Traverse array linearly and compare each value with the target.
  
arr = [10, 20, 30, 40, 50]
Enter search key  : 30
Output: value found
Enter search key: 300
Output: value not found 
*/

public class SearchElementAPP
{
	public static void main(String x[])
	{
		int arr[] = {10, 20, 30, 40, 50};
		int skey=300;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(skey==arr[i])
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Value found");
		}
		else
		{
			System.out.println("Value not found");
		}
	}
}