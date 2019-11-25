package mageswaran.unit2;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to count the number of vowels in a text entered
 * November 18, 2019
 * @author Mathen M 
 */

public class CountVowels {

	/**entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
// Input from user
		System.out.println("Enter text:");
		String text = sc.nextLine();
//Declaring variables		
		int finder = 0;
		int counter = 0;
//Do while loop for program to go through all characters and identify vowels
		do {
			if (text.charAt(finder) == 'a' ||text.charAt(finder) == 'e' ||text.charAt(finder) == 'i'|| text.charAt(finder) =='o' ||text.charAt(finder) =='u') {
				counter++;
				finder++;
			}
			} while (finder<text.length()); 
//End of loop
//Prints number of vowels
			System.out.println("The number of vowels in " + text + " is " + counter); 

		
		}
}






