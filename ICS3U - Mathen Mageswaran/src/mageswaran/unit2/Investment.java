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
	//Declaring variables
	double investment = 2500;
	double rate = 1.075;
	double years = 0;
	
	//Start loop
	do {
	investment = investment * rate;
	years = years + 1;
	//End loop when investment is greater than 5000
	} while (investment < 5000);
	
	//Print number of years it will take
	System.out.print("It will take " + years + " years for the investment to worth atleast $5,000 ");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
