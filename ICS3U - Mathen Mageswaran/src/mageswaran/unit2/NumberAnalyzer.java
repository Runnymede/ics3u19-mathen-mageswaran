package mageswaran.unit2;
	
import java.util.Scanner;
	
/**
 * ObjectHeight.java
 * This program is to find whether a number is negative or positive and 
 * whether if it's divisible by 7
 * October 2, 2019
 * @author Mathen M
 */

public class NumberAnalyzer {
	
	/**entry point to this program
	 * @param args unused
	 */
		
	public static void main(String[] args)
	{
	
			Scanner sc = new Scanner(System.in);
	//Declared variable and input number from user			
			System.out.println("Type in a number");
			double number = sc.nextDouble();
		{	
	//Output for if number is less then 0		
			if (number < 0)
			{
					System.out.println("Your number is negative =(");
			}
			else 
			{
					System.out.println("Your number is positive!");
			}
		}
				
		{	
			if (number%7 == 0)
				{
					System.out.println("Your number is divisible 7!");
				}
			else
				{
					System.out.println("Your number is not divisible by 7 =(");
				}
		}
			
			
			
			
	}
	
 }
