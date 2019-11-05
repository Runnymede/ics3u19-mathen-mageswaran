package mageswaran.unit2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to find the price print a certain amount of copies 
 * October 3, 2019
 * @author Mathen M
 */

public class PrintingCopyPrices {

	/**entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many copies would you like to make?");
		double copies = sc.nextDouble();
		double cost;
		
		if(copies >= 100)
		{
			cost = (0.25);
		}
		else if (copies >= 750)
		{
			cost = (0.26);
		}
		else if (copies >= 500)
		{
			cost = (0.27);
		}
		else if (copies >= 100)
		{
			cost = (0.28);
		}
		else
		{
			cost = (0.30);
		}
		
		DecimalFormat fullAmount = new DecimalFormat("$0.00");
		double totalPrice = cost * copies;
		
		System.out.println("The rate is " + fullAmount.format(cost) +" per copy");
		System.out.println("The total price is " + fullAmount.format(totalPrice));
		
			
		
	}

}
