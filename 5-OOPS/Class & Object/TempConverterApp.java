/*
Convert Celsius to Fahrenheit
Create a class TemperatureConverter with a method convertToFahrenheit that converts a Celsius value to Fahrenheit.
Explanation: Demonstrates unit conversion logic.
*/

import java.util.Scanner;
public class TempConverterApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature");
		int t=sc.nextInt();
		TemperatureConverter c = new TemperatureConverter();
		double result = c.convertToFahrenheit(t);
		System.out.printf("Temperature in Fahrenheit is: %f fahrenheit",result);
	}
}
class TemperatureConverter
{
	double convertToFahrenheit(int t)
	{
		double fahrenheit=(t * 1.8) + 32;
		return fahrenheit;
	}
}
		