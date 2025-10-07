/*
5. Company Profit Margin
Task:
 Create a Company class with fields: companyName, revenue, and expenses.
 In the main method:
Create a Company object.
Calculate the profit margin (profit/revenue) and display the result.
Explanation:
 This introduces basic mathematical operations and accessing object fields.
*/

import java.util.Scanner;
class Company
{
	private String companyName;
	private double revenue,expenses;
	
	public void setCompanyName(String name)
	{
		companyName = name;
	}
	public String getCompanyName()
	{
		return companyName;
	}
	public void setCompRevenue(double r)
	{
		revenue = r;
	}
	public double getCompRevenue()
	{
		return revenue;
	}
	public void setCompExpences(double ex)
	{
		expenses = ex;
	}
	public double getCompExpences()
	{
		return expenses;
	}
}

class Margin
{
	Company m[];
	public void setInput(Company...mar)
	{
		m = mar;
	}
	public void getOutput()
	{
		System.out.println("\n------------>Comapny Details<----------\n");
		for(int i=0;i<m.length;i++)
		{
			
			System.out.println("Company Name is: "+m[i].getCompanyName()+" and their margin is = "+((m[i].getCompRevenue()-m[i].getCompExpences())/m[i].getCompRevenue())*100);
		}
	}
	
}
public class CompanyProfitMarginAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of company");
		int n = sc.nextInt();
		Company comp[] = new Company[n];
		String name="";
		double revenue=0;
		double expenses=0;
		for(int i=0;i<comp.length;i++)
		{
			comp[i]=new Company();
			System.out.println("Enter Company Name");  //Alpha_Tech -----//Betafoods---//GammaTextiles
			name = sc.next();
			comp[i].setCompanyName(name);
			
			System.out.println("Enter Revenue of company"); // 1000000  //800000       //60000
			revenue=sc.nextDouble();
			comp[i].setCompRevenue(revenue);
			
			System.out.println("Enter Expenses of Company"); //700000   //500000        //450000
			expenses=sc.nextDouble();
			comp[i].setCompExpences(expenses);
		}
		
		Margin m = new Margin();
		m.setInput(comp);
		m.getOutput();     									//30.0      //37.5         //25.0
	}
}
