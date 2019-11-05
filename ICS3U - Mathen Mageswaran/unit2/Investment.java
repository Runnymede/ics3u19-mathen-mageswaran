package mageswaran.unit2;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to let players guess a random number selected by the computer
 * October 29, 2019
 * @author Mathen M
 */

public class Investment {

	/**entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args) {

	double investment = 2500;
	double rate = 1.075;
	double years = 0;
	
	do {
	investment = investment * rate;
	years = years + 1;
			
	} while (investment < 5000);
		
	System.out.print("It will take " + years + " years for the investment to worth atleast $5,000 ");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
