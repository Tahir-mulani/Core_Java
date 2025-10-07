/*
Q8. Write a java program to perform this operation.
• Sort the scores in descending order.
• Print the top 3 highest unique scores.
Sample Input: [78, 90, 90, 86, 85, 92, 70, 92]
Expected Output: 92, 90, 86
*/

public class TopUniqueEle
{
	public static void main(String x[])
	{
		//Scanner sc = new Scanner(System.in);
		int a[]={78,90,90,86,85,92,70,92};
		/*
		System.out.printf("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		*/
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		
		int right=0,left=1;
		
		while(a[right]<a.length && a[left]<a.length)
		{
			if(a[right]==a[left])
			{
				System.out.printf("%d\t",a[right]);
				right++;
				left++;
			}
			left++;
		}
	}
}