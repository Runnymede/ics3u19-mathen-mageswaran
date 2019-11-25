package mageswaran.unit1;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to find the object's height over a certain time
 * September 24, 2019
 * @author Mathen M
 */

public class ObjectHeight {
	
	private static Scanner sc;

	/**entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {
	
	//Inputting integer
		sc = new Scanner(System.in);
		
		System.out.println("Enter a time less than 4.5 seconds");
		double t = sc.nextDouble();
		double h;
	//Formula to calculate height
		h =  100 - 2.9 *t*t;
	//Output
		System.out.println("the height of the object is " + h + " metres");
		
		
				

	}

}
