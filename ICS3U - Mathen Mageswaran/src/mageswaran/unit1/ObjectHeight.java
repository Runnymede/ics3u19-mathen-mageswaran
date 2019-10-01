package mageswaran.unit1;

import java.util.Scanner;

public class ObjectHeight {
	/**
	 * ObjectHeight.java
	 * This program is to find the object's height over a certain time
	 * September 24, 2019
	 * @author Mathen M
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a time less than 4.5 seconds");
		double t = sc.nextDouble();
		double h;
		h =  100 - 2.9 *t*t;
		System.out.println("the height of the object is " + h + " metres");
		
		
				

	}

}
