package mageswaran.unit4;

import java.awt.Color;
import hsa_new.Console;

/**
 * ObjectHeight.java
 * This program is let user print temp.
 * January 14, 2020
 * @author Mathen M
 */

public class Gr11FactsAndCuriouculminatingFinalProject {
	static Console c = new Console();
	/**entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {
		
		c.println("Welcome to Facts & Curious, your very own learning world to drift through! What's your name?");
		String name = c.readLine();
		c.println("");
		c.println("Hey " + name + "! You can chose from a variety of fun and topics and questioning methods to quiz yourself and learn from");
		c.println("Which of these would you like to try? Press 0) to exit");
		c.println(" 1) Space 2) Biology 3) True or False");
		c.println(" 4) Mathematics 5) Random 6) Tim Hortons");
		c.println(" 7) Final Test");
		String option = c.readLine();

		if (option == "1") {
			Space();
		}
		
		else if (option == "2") {
			Biology();
		}
			
		else if (option == "3") {
			Random();
		}
		
		else if (option == "4") {
			TrueOrFalse();
		}
		
		else if (option == "5") {
			TimHortons();
		}
		
		else if (option == "6") {
			FinalTester();
		}

		else if (option == "7") {
			FinalTester();
		}
		
		else if (option == "0") {
			c.println("");
			break;
		}
		
	}
	
	
	
	
	
	
	
	
	
	public static double Space(int QuesAndInfo) {
		String [] spaceQues = {};
		String [][] spaceOptions = {{}};
		String [] spaceRight = {};
		String [] spaceExplain = {};
		int correctCounter = 0;

		c.println("");
		for(int i = 10; i<10; i++) {
			c.println(spaceQues[i]);
			for(int j = 1; j<4; j++) {
			c.println(spaceOptions [i][j]);
			}
			String answer = c.readLine();
		if (answer == spaceRight[i]) {
			c.setTextBackgroundColor(Color.GREEN);
			c.clear();
			c.println(spaceQues[i]);
			for(int j = 1; j<4; j++) {
				c.println(spaceOptions [i][j]);
			c.println("That's correct!");
			Thread.sleep(2000);
			c.setTextBackgroundColor(Color.WHITE);
			c.clear();
			c.println(spaceExplain[i]);
			correctCounter = + 1;
		}
		
		else {
			c.println("Oops sorry that is incorrect. The right answer is " + spaceRight[i] + "!");
			c.println(spaceExplain[i]);
		}
		}
		c.println("Good work! Your final mark for this topic is " + Average(correctCounter) + "%");
		return Average(correctCounter);
	}
	
	public static double Biology(int QuesAndInfo) {
		String [] bioQues = {};
		String [][] bioOptions = {{}};
		String [] bioRight = {};
		String [] bioExplain = {};
		int correctCounter = 0;

		c.println("");
		for(int i = 10; i<10; i++) {
			c.println(bioQues[i]);
			for(int j = 1; j<4; j++) {
			c.println(bioOptions [i][j]);
			}
			String answer = c.readLine();
		if (answer == bioRight[i]) {
			c.println("That's correct!");
			c.println(bioExplain[i]);
			correctCounter = + 1;
		}
		
		else {
			c.println("Oops sorry that is incorrect. The right answer is " + bioRight[i] + "!");
			c.println(bioExplain[i]);
		}
		}
		c.println("Good work! Your final mark for this topic is " + Average(correctCounter) + "%");
	}
	
	public static double Random(int QuesAndInfo) {
		String [] randomQues = {};
		String [][] randomOptions = {{}};
		String [] randomRight = {};
		String [] randomExplain = {};
		int correctCounter = 0;

		c.println("");
		for(int i = 10; i<10; i++) {
			c.println(randomQues[i]);
			for(int j = 1; j<4; j++) {
			c.println(randomOptions [i][j]);
			}
			String answer = c.readLine();
		if (answer == randomRight[i]) {
			c.println("That's correct!");
			c.println(randomExplain[i]);
			correctCounter = + 1;
		}
		
		else {
			c.println("Oops sorry that is incorrect. The right answer is " + randomRight[i] + "!");
			c.println(randomExplain[i]);
		}
		}
		c.println("Good work! Your final mark for this topic is " + Average(correctCounter) + "%");
	}
	
	public static double TrueOrFalse(int QuesAndInfo) {
		String [] trueOrFalseQues = {};
		String [] trueOrFalseRight = {};
		String [] trueOrFalseExplain = {};
		int correctCounter = 0;

		c.println("");
		for(int i = 10; i<10; i++) {
			c.println(trueOrFalseQues[i]);
			String answer = c.readLine();
		if (answer == trueOrFalseRight[i]) {
			c.println("That's correct!");
			c.println(trueOrFalseExplain[i]);
			correctCounter = + 1;
		}
		
		else {
			c.println("Oops sorry that is incorrect. The right answer is " + trueOrFalseRight[i] + "!");
			c.println(trueOrFalseExplain[i]);
		}
		}
		c.println("Good work! Your final mark for this topic is " + Average(correctCounter) + "%");
	}
	
	public static double TimHortons(int QuesAndInfo) {
		String [] timHortonsQues = {};
		String [][] timHortonsOptions = {{}};
		String [] timHortonsRight = {};
		String [] timHortonsExplain = {};
		int correctCounter = 0;

		c.println("");
		for(int i = 10; i<10; i++) {
			c.println(timHortonsQues[i]);
			for(int j = 1; j<4; j++) {
			c.println(timHortonsOptions [i][j]);
			}
			String answer = c.readLine();
		if (answer == timHortonsRight[i]) {
			c.println("That's correct!");
			c.println(timHortonsExplain[i]);
			correctCounter = + 1;
		}
		
		else {
			c.println("Oops sorry that is incorrect. The right answer is " + timHortonsRight[i] + "!");
			c.println(timHortonsExplain[i]);
		}
		}
		c.println("Good work! Your final mark for this topic is " + Average(correctCounter) + "%");
	}
	
	public static double FinalTester(int QuesAndInfo) {
		String [] finalTesterQues = {};
		String [][] finalTesterOptions = {{}};
		String [] finalTesterRight = {};
		String [] finalTesterExplain = {};
		int correctCounter = 0;

		c.println("");
		for(int i = 10; i<10; i++) {
			c.println(finalTesterQues[i]);
			for(int j = 1; j<4; j++) {
			c.println(finalTesterOptions [i][j]);
			}
			String answer = c.readLine();
		if (answer == finalTesterRight[i]) {
			c.println("That's correct!");
			c.println(finalTesterExplain[i]);
			correctCounter = + 1;
		}
		
		else {
			c.println("Oops sorry that is incorrect. The right answer is " + finalTesterRight[i] + "!");
			c.println(finalTesterExplain[i]);
		}
		}
		c.println("Good work! Your mark for the final is " + Average(correctCounter) + "%");
		
	}
	
	
	
	
	public static double Average (int correctCounter) {
		double mark = correctCounter / 10;
		return mark;
	}

	
	
	
	
	
	
	
	
	
	

}
