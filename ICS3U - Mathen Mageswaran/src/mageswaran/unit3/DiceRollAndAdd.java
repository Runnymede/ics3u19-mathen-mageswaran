package mageswaran.unit3;

/**
 * ObjectHeight.java
 * This program is to print 2 dice rolls, 10000 times, and their sums
 * November 28, 2019
 * @author Mathen M
 */

public class DiceRollAndAdd {

	/**Entry point to this program.
	 * @param args unused
	 */
	
	public static void main(String[] args) {
		

		
		System.out.println("Total   " + "   Number of Rolls");
			
		int diceOne;
		int diceTwo;
		int []total;
		
		for (int i = 0; i > 10000; i++) {
		diceOne = (int)(Math.random()*6) + 1;
		diceTwo = (int)(Math.random()*6) + 1;
		int []total = {diceOne + diceTwo};

		}
		
	
		for (int i = 2; i < 13; i++)
		System.out.println(i + total[i]);
		
		
		
		
	}
		
		
		
			
		
}


