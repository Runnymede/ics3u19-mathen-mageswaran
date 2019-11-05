package mageswaran.unit2;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to give the value of the sum off all the digits entered
 * October 29, 2019
 * @author Mathen M
 */

public class DigitsSum {

	/**entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	//User input integer		
		System.out.println("Enter a positive integer: "); 
		String num = sc.nextLine();
	//Declaring Variables
		int length = num.length();
		int counter = 0;
		int value;
	//Start loop	
		do {
		
		System.out.println(num.charAt(counter));
		char a = num.charAt(counter);
		int b = Character.getNumericValue(a);
		counter = counter + 1;
	//End loop	
		} while (counter < length);
			 
	
		
		
	}

}
