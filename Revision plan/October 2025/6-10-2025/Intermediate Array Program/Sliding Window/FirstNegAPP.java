/*
 First Negative Number in Every Window of Size K

Approach: Sliding Window with queue
Example: arr = [12, -1, -7, 8, -15, 30, 16, 28], k = 3
*/

public class FirstNegAPP
{
    public static void main(String[] args)
	{
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int n = arr.length;
        int k = 3;
		
		for(int i=0;i<=n-k;i++)
		{
			boolean flag=false;
			System.out.print("window " +(i+1)+ " = ");
			for(int j=i;j<i+k;j++)
			{
				
				if(arr[j]<0)
				{
					System.out.println(arr[j]);
					flag=true;
					break;
				}
				
			}
				
			if (!flag)
			{
				System.out.println("0");
			}
		}
    }
}
