package mageswaran.unit2;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to find the exponents for the numbers from 1 to 5
 * November 11, 2019
 * @author Mathen M
 */

public class PowerTable {

	/**entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	System.out.println("Enter the highest base:");
	int power = sc.nextInt();
	int pw = power;
	
	System.out.println("Enter the highest expoenent:");
	int exponent = sc.nextInt();
	int exp = exponent;

		for (power = 1; power <= pw; power++) {
	
			for(exponent = 1; exponent <= exp; exponent++) {
			
				double result = Math.pow(power, exponent);
				Math.round(result);
				
				System.out.format("%18s", (int)result);
			}
				System.out.println(" ");
				System.out.println(" ");
		
		}
	}

}
