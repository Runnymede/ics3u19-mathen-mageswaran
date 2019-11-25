package mageswaran.unit2;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to let players guess a random number selected by the computer
 * October 28, 2019
 * @author Mathen M
 */

public class GuessingGame2 {

	/**entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args)
	{
	//Declaring variable
	int secretNum;
	int userNumber;
		
	//Variable with value
	secretNum = (int)(Math.random()*21) + 1;
	
	//Input & Variable with value
	Scanner sc = new Scanner(System.in);
	
	//Start loop
	do {
	System.out.println("Enter a number between 1 and 20: ");
	userNumber = sc.nextInt();
	
	
	if (secretNum == userNumber)
		{
			System.out.println("You won!");
		}
	else
		{
			System.out.println("Try again.");
		}
	
	//End loop if the secretNum does not equal the userNumber
	} while (secretNum != userNumber);
	
	}
	
	
}
