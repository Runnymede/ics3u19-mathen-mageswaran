package mageswaran.unit2;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to practice your math skills
 * October 25, 2019
 * @author Mathen M
 */
public class MathTutor {
	
	/**entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Generators for 2 numbers
	int firstNum = (int)(Math.random()*10) + 1;
	int secondNum = (int)(Math.random()*10) + 1;
	int operator = (int)(Math.random()*4) + 1;
	Scanner sc = new Scanner(System.in);
	//Start switch statement to input value form user
	switch (operator)
	{
	
	//Operator used if number 1 is randomly chosen
	case 1: System.out.println("What is " + firstNum + " + " + secondNum + " ?");
	//Declaring variables
			double userAnswerA = sc.nextDouble();
			double rightAnsA = firstNum + secondNum;
	//If else statements depending of whether userAnswerA == rightAnsA or not
			if (userAnswerA == rightAnsA)
				{
					System.out.println("Correct!");
				}
			else
				{
					System.out.println("That is incorrect");
				}
			break;

	//Operator used if number 2 is randomly chosen
	case 2: System.out.println("What is " + firstNum + " - " + secondNum + " ?");
	//Declaring variables
			double userAnswerS = sc.nextDouble();
			double rightAnsS = firstNum - secondNum;
	//If else statements depending of whether userAnswerA == rightAnsA or not
			if (userAnswerS == rightAnsS)
				{
					System.out.println("Correct!");
				}
			else
				{
					System.out.println("That is incorrect");
				}
			break;

	//Operator used if number 3 is randomly chosen
	case 3:	System.out.println("What is " + firstNum + " X " + secondNum + " ?");
	//Declaring variables
			double userAnswerM = sc.nextDouble();
			double rightAnsM = firstNum * secondNum;
	//If else statements depending of whether userAnswerA == rightAnsA or not
			if (userAnswerM == rightAnsM)
				{
					System.out.println("Correct!");
				}
			else
				{
					System.out.println("That is incorrect");
				}	
			break;
	
	//Operator used if number 14 is randomly chosen
	case 4: System.out.println("What is " + firstNum + " / " + secondNum + " ?");
	//Declaring variables
			double userAnswerD = sc.nextDouble();
			double rightAnsD = firstNum / secondNum;
	//If else statements depending of whether userAnswerA == rightAnsA or not
			if (userAnswerD == rightAnsD)
				{
					System.out.println("Correct!");
				}
			else
				{
					System.out.println("That is incorrect");
				}
			break;	
				
	}		
				
		
		
	}

}
