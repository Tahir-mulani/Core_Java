//Q6. Write a java program to search element in array , its element found or not.

import java.util.*;
public class ArrAppQ6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter array element");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		boolean flag=false;
		System.out.println("enter element");
		int a=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==a){
				flag=true;
				break;
			}
			else{
				continue;
			}
		}
		if(flag){
		System.out.println("element is found");
		}
		else{
			System.out.println("element is notfound");
		}
	}
}

	