package mageswaran.unit2;

/**
 * ObjectHeight.java
 * This program is to roll 2 dice, get print the value of each and the sum of both
 * November 12, 2019
 * @author Mathen M 
 */

public class DiceRolls {

	/**entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		System.out.format("Dice 1 %7s %7s", "Dice 2", "Total\n");
		
		for (int rolls = 0; rolls < 5; rolls++)
			{
				int diceOne = (int)(Math.random()*6) + 1;
				int diceTwo = (int)(Math.random()*6) + 1;
				int total = diceOne + diceTwo;
			
				System.out.print("   " + diceOne + "       ");
				System.out.print(diceTwo + "      ");
				System.out.println(total + "        ");
			}
		
		
	}

}
