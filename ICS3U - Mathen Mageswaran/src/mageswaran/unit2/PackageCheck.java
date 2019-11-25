package mageswaran.unit2;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to check whether an applied package is eligible to be shipped
 * October 15, 2019
 * @author Mathen M
 */

public class PackageCheck {

	/**entry point to this program
	 * @param args unused
	 */
		
	public static void main(String[] args)
{	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the package weight in kilograms:");
	double weight = sc.nextDouble();
	System.out.println("Enter package length in centimeters:");
	double length = sc.nextDouble();
	System.out.println("Enter package width in centimeters:");
	double width = sc.nextDouble();
	System.out.println("Enter package height in centimeters:");
	double height = sc.nextDouble();
	double cubicMetres = length*width*height;
	
		if (weight > 27 && cubicMetres > 1000000)
			{
				System.out.println("Too heavy and too large.");
			}
	
		else if (weight > 27 && cubicMetres <= 1000000)
			{
				System.out.println("Too heavy.");
			}
		else if (weight <= 27 && cubicMetres > 1000000)
			{
				System.out.println("Too large.");
			}
		else 
			{
				System.out.println("Accepted.");
			}
	
	
	
	}
	
	
}
