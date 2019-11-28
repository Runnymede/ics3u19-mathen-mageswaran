package mageswaran.unit3;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is let user print any number of names properly and then again backwards
 * November 25, 2019
 * @author Mathen M
 */

public class NameList {

	/**entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many names would you like to enter");
		int amount = sc.nextInt();
		String [] names = new String[amount]; 
		
		System.out.println("Enter the " + amount + " names one by one");
		for (int i = 0; i < amount; i++) {
		names[i] = sc.next(); 
		}
		
		System.out.println();

		for (int y = 0; y < names.length; y++) {
		System.out.println(names[y]);
		}
		
		System.out.println();
		
		for (int b = names.length-1; b >= 0; b--) {
			System.out.println(names[b]);
		}
	
		
	}

}
