package mageswaran.unit1;

import java.util.Scanner;

public class NumberPlaceSeperator {
	private static Scanner sc;

	/**
	 * ObjectHeight.java
	 * This program is to find the digits in the hundredth, tenth, and ones place
	 * September 24, 2019
	 * @author Mathen M
	 */

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		
		System.out.println("Type in a three-digit number"); 
		int x = sc.nextInt();
		int h = java.lang.Math.round(x/100);
		int t = java.lang.Math.round((x%100)/10);
		int o = x%10;
		
		System.out.println("Hundreds: " + h);
		System.out.println("Tens: " + t);
		System.out.println("Ones: " + o);








	}

}