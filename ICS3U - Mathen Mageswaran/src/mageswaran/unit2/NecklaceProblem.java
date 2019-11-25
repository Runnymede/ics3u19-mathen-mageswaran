package mageswaran.unit2;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to practice your math skills
 * October 25, 2019
 * @author Mathen M
 */

public class NecklaceProblem {

	/**entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	//Input from user
		System.out.println("Enter a single digit.");
		int num = sc.nextInt();
		System.out.println("Enter a single digit.");
		int numTwo = sc.nextInt();
	//Declaring variables
		int sum = num + numTwo;
	//Printing starting tow numbers
		System.out.println(num);
		System.out.println(numTwo);
	//Declaring new variables for same value to use in loop
		int numA = num;
		int numB = numTwo;
	//Start of loop
		do {
			sum = numB + numA;
	//If else statement with mudulosin case a double digit number is summed because only the ones digit are used
			if (sum >= 10)
				{
					sum = sum % 10;
					System.out.println(sum);
				}
			else
				{
					System.out.println(sum);
				}
			numA = numB;
			numB = sum;
		}while(numA != num && numB != numTwo);
				
		System.out.println(num);
		System.out.println(numTwo);

	
		

	}

}