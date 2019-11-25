package mageswaran.unit2;

/**
 * ObjectHeight.java
 * This program is to let players guess a random number selected by the computer
 * November 14, 2019
 * @author Mathen M
 */

public class LicenseToRide {

	/**entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args) {
		
		
		int counter = 0;
		for (int plate = 9999; plate >= 0; plate--)
		{
			int firstDigit = java.lang.Math.round((plate/100)/10);
			int secondDigit = (plate/100)%10;
			int thirdDigit = java.lang.Math.round((plate%100)/10);
			int fourthDigit = plate%10;
			
			int total = firstDigit + secondDigit + thirdDigit + fourthDigit;
			
			if (total >= 34)
				counter++;
			
		}
		
		double probability = (counter/10000.0) * 100;
		System.out.println("The probability of getting number plate that has a sum of 34 or greater is " + probability+ "%");
		
	
	
	
	}
		
		
		
		
		
}


