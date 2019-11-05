package mageswaran.unit2;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to let players guess a random number selected by the computer
 * October 22, 2019
 * @author Mathen M
 */

public class GuessingGame {

	/**entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args)
	{
	
	//Variable with value
	int secretNum = (int)(Math.random()*21) + 1;
	
	//Input & Variable with value
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number between 1 and 20: ");
	int userNumber = sc.nextInt();
	
	//Output
	System.out.println("Computer's number: " + secretNum);
	System.out.println("Player's number: " + userNumber);
	
	if (secretNum == userNumber)
		{
			System.out.println("You won!");
		}
	else
		{
			System.out.println("Better luck next time.");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
