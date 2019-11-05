package mageswaran.unit2;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to find whether an owner has a defective car or not
 * October 28, 2019
 * @author Mathen M 
 */

public class CarRecall2 {

	/**entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	//Declaring variable
		int modelNum;
	//Starting loop
		do {
	//User input			
				System.out.println("Enter your car's model number or press 0 to quit");
				modelNum = sc.nextInt();
	//Switch statement to determine car model
				switch (modelNum)

				{
				case 179:
				case 189:
				case 190: 
				case 191: 
				case 192: 
				case 193: 
				case 194: 
				case 195: 
				case 199:
				case 221: 
	//Output if car is defective
				case 780: System.out.println("Your car is  defective. It must be repaired.");
				break;
	//Output if car is not defective
				default: System.out.println("Your car is not defective.");
				break;
				} 
		} while (modelNum != 0);

	}
}
