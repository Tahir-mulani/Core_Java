class staticTrial
{
	static int sn;
	static void staticTest()
	{
		int n=0;
		n=n+1;
		sn=sn+1;
		System.out.printf("\nnormal variable n -----> %d\n",n);
		System.out.printf("\nstatic variable sn -----> %d\n",sn);
	}
}
class TestAPP
{
	public static void main(String x[])
	{
		staticTrial.staticTest();
		staticTrial.staticTest();
		staticTrial.staticTest();
	}
}
		