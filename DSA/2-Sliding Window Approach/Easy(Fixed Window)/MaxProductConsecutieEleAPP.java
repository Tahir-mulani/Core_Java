//3.Find maximum product of any K consecutive elements
public class MaxProductConsecutieEleAPP
{
	public static void main(String x[])
	{
		int arr[] ={2, 3, 5, 1, 4};
		int prod=1;
		int k=3;
		for(int i=0;i<k;i++)
		{
			prod=prod*arr[i];
		}
		int maximumProduct=prod;
		
		for(int i=k;i<arr.length;i++)
		{
			prod=prod*arr[i]/arr[i-k];
			if(prod>maximumProduct)
			{
				maximumProduct=prod;
			}
		}
		System.out.println("Maximum Product is :"+ maximumProduct);
		
	}
}
