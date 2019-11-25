package mageswaran.unit2;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to find whether an owner has a defective car or not
 * October 4, 2019
 * @author Mathen M 
 */

public class CarRecall {

	/**entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args) 
{
		Scanner sc = new Scanner(System.in);
	//Inputing car model
		System.out.println("Enter your car's model number");
		int modelNum = sc.nextInt();
	//Switch statement to determine car
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
		case 780: System.out.println("Your car is  defective. It must be repaired.");
		break;
		default: System.out.println("Your car is not defective.");
		break;
		}
			
		
		
	}

}
