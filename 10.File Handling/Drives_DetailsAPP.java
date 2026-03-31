import java.io.*;
public class Drives_DetailsAPP
{
	public static void main(String x[])
	{
		File roots[] = File.listRoots();
		
		for(int i=0; i<roots.length;i++)
		{
			long totalSpace = roots[i].getTotalSpace();
			long freeSpace = roots[i].getFreeSpace();
			
			System.out.println(roots[i]+"\t"+(totalSpace/1073741824)+" GB"+"\t"+(freeSpace/1073741824) +" GB ");
			
		}
	}
}