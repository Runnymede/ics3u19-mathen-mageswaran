package mageswaran.unit2;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to separate the digits of an entered integer
 * October 29, 2019
 * @author Mathen M 
 */

public class DigitsDisplay {

	/**entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	//Input number from user	
		System.out.println("Enter a positive integer: "); 
		String num = sc.nextLine();
	//Declaring variables	
		int length = num.length();
		int counter = 0;
	//Start loop		 
		do {
		System.out.println(num.charAt(counter));
		counter = counter + 1;
	//End loop if counter has the same value as length
		} while (counter < length);
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
	}

}
