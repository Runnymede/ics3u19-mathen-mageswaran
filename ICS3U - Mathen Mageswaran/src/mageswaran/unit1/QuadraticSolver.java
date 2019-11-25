package mageswaran.unit1;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to find the 2 roots of an equation
 * September 30, 2019
 * @author Mathen M
 */

public class QuadraticSolver {
	
	/**entry point to this program
	 * @param args unused
	 */
	
	private static Scanner sc;

	public static void main(String[] args) {
	
	//Inputting integers
		sc = new Scanner(System.in);
		
		System.out.println("What is the value of a?"); 
		double a = sc.nextDouble();
		System.out.println("What is the value of b?"); 
		double b = sc.nextDouble();
		System.out.println("What is the value of c?"); 
		double c = sc.nextDouble();
	
	//declaring variable and formula
		int z = -1;
		double x = ((b*z) + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a); 
		double y = ((b*z) - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a); 
	//Output	
		System.out.print("The roots of this equations are " + x + " and " + y);
		
		
	}
		
}

