import java.util.Scanner;
public class Q7
{	
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		
		/*enter the array size.
		int n1=sc.nextInt();  
		int n2=sc.nextInt();
		*/
		int a[]={1, 2, 3, 4};
		int b[]={3, 4, 5, 6};
		
		/*enter array element.
		System.out.printf("enter first array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.printf("enter second array element");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();    
		}
		*/

		//find union array.(using two pointer approach).
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]!=b[j])
				{
					b[i]=a[i];
				}
				System.out.printf("%d\t",a[i]);
			}
		}
			
	}
}

