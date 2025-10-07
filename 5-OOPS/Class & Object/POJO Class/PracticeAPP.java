class Student
{
	private roll no;
	private String name;
	private String address;
	public setRoll(int r)
	{
		roll = r
	}
	public void getRoll()
	{
		System.out.println("Roll no of student is"+roll);
	}
	public setName(int n)
	{
		name = n;
	}
	public void getName()
	{
		System.out.println("Name of student is"+name);
	}
	public setAddress(int a)
	{
		address = a;
	}
	public void getAddress()
	{
		System.out.println("Address of student is"+address);
	}
}
public class PracticeAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[5];
		for(int i =0;i<s.length;i++)
		{
			s[i]=new Student();
			s[i].setRoll();
			s[i].setName();
			s[i].setAddress();
		}
	}
}