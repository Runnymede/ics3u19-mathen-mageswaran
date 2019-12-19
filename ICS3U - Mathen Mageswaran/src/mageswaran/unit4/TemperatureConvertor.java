package mageswaran.unit4;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is let user print temp.
 * December 18, 2019
 * @author Mathen M
 */

public class TemperatureConvertor {

	/**entry point to this program
	 * @param args unused
	 */
	
		public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Do you want to:");
			System.out.println("1) Convert from fahreinheit to celsius");
			System.out.println("2) Convert from celsius to fahreinheit");
			int choice = sc.nextInt();
			int one = 1;
			int two = 2;
			
			if(choice == one) {
				System.out.println("Enter temperature: ");
				double temp = sc.nextDouble();
				System.out.println("The temperature in celsius is " + fahreinheitToCelsuis(temp) + " ");
				fahreinheitToCelsuis(temp);
			}
			
			else {
				System.out.println("Enter temperature: ");
				double temp = sc.nextDouble();
				System.out.println("The temperature in fahreinheit is " + celsiusToFahreinheit(temp) + " ");
				celsiusToFahreinheit(temp);
			}
			
		}
	
		
		public static double fahreinheitToCelsuis(double temp) {
			double celsius =  (temp - 32) * 5 / 9;
			return celsius;
		}
		
		public static double celsiusToFahreinheit(double temp) {
			double fahreinheit = (temp * 9 / 5) + 32 ;
			return fahreinheit;
		}
		
	}
