import java.io.*;
import java.util.*;
public class WriteData_FileAPP
{
	public static void main(String x[]) throws IOException
	{
		FileWriter fw = new FileWriter("D:\\demo.txt",false);
		
		System.out.println("Enter data in demo.txt file");
		String data = new Scanner(System.in).nextLine();
		fw.write(data);
		
		fw.close();
		System.out.println("Data Saved successfully...!");		
			
	}
}