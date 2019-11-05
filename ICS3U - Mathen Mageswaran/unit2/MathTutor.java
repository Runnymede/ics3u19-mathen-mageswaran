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

	switch (operator)
	{
	case 1: System.out.println("What is " + firstNum + " + " + secondNum + " ?");
			double userAnswerA = sc.nextDouble();
			double rightAnsA = firstNum + secondNum;
			if (userAnswerA == rightAnsA)
				{
					System.out.println("Correct!");
				}
			else
				{
					System.out.println("That is incorrect");
				}
			break;
	case 2: System.out.println("What is " + firstNum + " - " + secondNum + " ?");
			double userAnswerS = sc.nextDouble();
			double rightAnsS = firstNum - secondNum;
			if (userAnswerS == rightAnsS)
				{
					System.out.println("Correct!");
				}
			else
				{
					System.out.println("That is incorrect");
				}
			break;
	
	case 3:	System.out.println("What is " + firstNum + " X " + secondNum + " ?");
			double userAnswerM = sc.nextDouble();
			double rightAnsM = firstNum * secondNum;
			if (userAnswerM == rightAnsM)
				{
					System.out.println("Correct!");
				}
			else
				{
					System.out.println("That is incorrect");
				}	
			break;
		
	case 4: System.out.println("What is " + firstNum + " / " + secondNum + " ?");
			double userAnswerD = sc.nextDouble();
			double rightAnsD = firstNum / secondNum;
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
