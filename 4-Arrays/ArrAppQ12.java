/*Q12. Write a java program to find missing value in array.
Input : 1 4 6 7 11 15
Output : 2 3 5 8 9 10 12 13 14
*/
import java.util.*;
public class ArrAppQ12{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		//input array size.
		System.out.println("enter limit:");
		int n=sc.nextInt();
		
		//input array element.
		System.out.println("enter elements:");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		//sort the array.
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
		
		
		//find maximum element array.
		int max=a[a.length-1];
		
		//print missing number.
		for(int i=0;i<a.length;i++){
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		System.out.println("---------------------------");
		
		//pointer of missing array.
		int k=0;
		
		//print missing array.
		for(int i=1;i<max;i++){
			if(a[k]!=i){
				System.out.printf("%d\t",i);
			}
			else{
				k++;
			}
		}
	}
}