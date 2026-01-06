/*
Q6.Write a Java program to convert a primitive double value 45.67 to a String using Double.toString(),
 and then convert the string back to a double using Double.parseDouble(). Print both values.
Explanation:
toString() converts a number to its string representation.
parseDouble() converts a string back to a primitive double.
This shows how wrapper classes help when working with both numbers and text formats.
*/
 
public class ConvertPrimitiveToStringAPP
{
	public static void main(String x[])
	{
		double d = 45.67;
		
		String str = Double.toString(d);
		System.out.println("After Convert Double to String Using 'Double.toString() Method' str = "+str);
		
		double num = Double.parseDouble(str);
		System.out.println("After Convert String to Double  Using 'Double.parseDouble() Method' num = "+num);
		
	}
}