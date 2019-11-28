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
		
		int diceOne;
		int diceTwo;
		int []total;		

		for (int i = 0; i > 10; i++) {
		diceOne = (int)(Math.random()*6) + 1;
		diceTwo = (int)(Math.random()*6) + 1;
		total[] = {diceOne + diceTwo};		
		}
		
		System.out.println(total[i]);

		
		System.out.println("Total   " + "   Number of Rolls");
		System.out.println("  1");
		System.out.println("  2");
		System.out.println("  3");
		System.out.println("  4");
		System.out.println("  5");
		System.out.println("  6");
		System.out.println("  7");
		System.out.println("  8");
		System.out.println("  9");
		System.out.println("  10");
		System.out.println("  11");
		System.out.println("  12");

			
		for (int i = 0; i > 10000; i++) {
		int diceOne = (int)(Math.random()*6) + 1;
		int diceTwo = (int)(Math.random()*6) + 1;
		int []total = {diceOne + diceTwo};
		System.out.println(i + "   " + total[0]);
		
		
	
		
		
		
		
		
	}
		
		
		
			
		
	}

}
