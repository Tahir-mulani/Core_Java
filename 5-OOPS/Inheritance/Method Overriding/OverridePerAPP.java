class Per
{
	int per,agg=0;
	void calPer(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			agg=agg+arr[i];
		}
		per=agg/arr.length;
	}
}
class Eight extends Per
{
	void showEghtPer()
	{
		System.out.println("Eight percentage is "+per);
	}
}
class Nine extends Per
{
	void showNinePer()
	{
		System.out.println("Nine percentage is "+per);
	}
}
class Ten extends Per
{
	int year;
	void askAddmissionYear(int year)
	{
		this.year = year;
	}
	void calPer(int arr[])
	{
		if(year<2015)
		{
			super.calPer(arr);
		}
		else
		{
			for(int i=0;i<arr.length;i++)
			{
				for(int j=(i+1);j<arr.length;j++)
				{
					if(arr[i]<arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			for(int i=0;i<(arr.length-1);i++)
			{
				agg=agg+arr[i];
			}
			per=agg/(arr.length-1);
		}
	}
	void showTenPer()
	{
		System.out.println("Ten percentage is "+per);
	}
}
public class OverridePerAPP
{
	public static void main(String x[])
	{
		int a[] = new int[]{70,80,60,70,60,80};
		Eight e = new Eight();
		e.calPer(a);
		e.showEghtPer();
		
		Nine n = new Nine();
		n.calPer(a);
		n.showNinePer();
		
		Ten t = new Ten();
		t.askAddmissionYear(2018);
		t.calPer(a);
		t.showTenPer();
	}
}
	