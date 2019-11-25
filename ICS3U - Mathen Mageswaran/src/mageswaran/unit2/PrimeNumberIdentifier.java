package mageswaran.unit2;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to find whether the given numbers are prime or not
 * November 4, 2019
 * @author Mathen M
 */
public class PrimeNumberIdentifier {

	/**entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a number");
	int num = sc.nextInt();
	System.out.println("Enter another number");
	int numTwo = sc.nextInt();
	double limit = Math.sqrt(num);
	double limitTwo = Math.sqrt(numTwo);
	int divider = 2;
	double remain = -1;
	double remainTwo = -1;
	
	do {
		remain = num % divider;
		
		if (remain == 0) {
			break;}
		else
		divider = divider + 1;
		} while (divider <= limit);
			
	do {
		remainTwo = numTwo % divider;
		
		if (remainTwo == 0) {
			break;}
		else
		divider = divider + 1;
		} while (divider <= limitTwo);
			
	
	if (remain == 0 && remainTwo != 0)
		{
			System.out.println("Your first number is not prime but your second number is prime.");
		}
	else if (remain != 0 && remainTwo == 0)
		{
			System.out.println("Your first number is prime but your second number is not prime.");
		}
	else if (remain != 0 && remainTwo != 0)
		{
			System.out.println("Your numbers are both prime");
		}
	else 
		{
			System.out.println("Your numbers are both not prime");
		}
			
			
		}
		
		
		
				
}
