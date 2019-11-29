package mageswaran.unit3;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to print 2 dice rolls, 10000 times, and their sums
 * November 28, 2019
 * @author Mathen M
 */

public class GuessingGame {

	/**Entry point to this program.
	 * @param args unused
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		String [] food = {"a mango", "rice", "soup", "a dog", "a tomato", "a potato", "bread", "candy", "chocolate", "a donut", "a timbit", "pizza", "a burger", "a hot dog", "a bagel", "cereal", "a sandwich", "a watermelon", "an apple", "chips"};
		
		int object = (int)(Math.random()*20) + 1;
		System.out.println("Hi, let's play a guessing game. Think of a common food item and press yes or no when I guess what it may be?");
		String answer;
		
		do{
			int guess = (int)(Math.random()*20) + 1;
			System.out.println("is it " + food[guess] + "?");
			 answer  = sc.next();
		}while(answer.equalsIgnoreCase("no"));
		
		System.out.println("I win!!!");
	}

}

