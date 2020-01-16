package mageswaran.unit4;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is let user print temp.
 * January 14, 2020
 * @author Mathen M
 */

import java.util.Scanner;

public class Gr11FactsAndCuriousCulminatingFinalProject {
	
	/**entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Facts & Curious, your very own learning world to drift through! What's your name?");
		String name = sc.nextLine();
		System.out.println("");
		System.out.println("Hey " + name + "! You can chose from a variety of fun and topics and questioning methods to quiz yourself and learn from");
		System.out.println("Which of these would you like to try? Press 0) to exit");
		System.out.println(" 1) Space 2) Biology 3) True or False");
		System.out.println(" 4) Mathematics 5) Random 6) Tim Hortons");
		System.out.println(" 7) Final Test");
		String option = sc.nextLine();

		if (option==1) {
			
		}
		
		else if (option==2) {
			
		}
			
		else if (option==3) {
			
		}
		
		else if (option==4) {
			
		}
		
		else if (option==5) {
	
		}
		
		else if (option==6) {
			
		}

		else if (option==7) {
			
		}
		
		else if (option==0) {
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	public static int Space(int QuesAndInfo) {
		Scanner sc = new Scanner(System.in);
		String [] spaceQues = {};
		String [][] spaceOptions = {{}};
		String [] spaceRight = {};
		String [] spaceExplain = {};
		
		System.out.println("");
		for(int i = 10; i<10; i++) {
			System.out.println(spaceQues[i]);
			for(int j = 1; j<4; j++) {
			System.out.println(spaceOptions [i][j]);
			}
			String answer = sc.nextLine();
		if (answer == spaceRight[i]) {
			System.out.println("That's correct!");
			System.out.println(spaceExplain[i]);
			int correctCounter = + 1;
		}
		
		else {
			System.out.println("Oops sorry that is incorrect. The right answer is " + spaceRight[i] + "!");
			System.out.println(spaceExplain[i]);
		}
		}
	}
	
	public static int Biology(int QuesAndInfo) {
		Scanner sc = new Scanner(System.in);
		String [] bioQues = {};
		String [][] bioOptions = {{}};
		String [] bioRight = {};
		String [] bioExplain = {};
		
		System.out.println("");
		for(int i = 10; i<10; i++) {
			System.out.println(bioQues[i]);
			for(int j = 1; j<4; j++) {
			System.out.println(bioOptions [i][j]);
			}
			String answer = sc.nextLine();
		if (answer == bioRight[i]) {
			System.out.println("That's correct!");
			System.out.println(bioExplain[i]);
			int correctCounter = + 1;
		}
		
		else {
			System.out.println("Oops sorry that is incorrect. The right answer is " + bioRight[i] + "!");
			System.out.println(bioExplain[i]);
		}
		}
	}
	
	public static int Random(int QuesAndInfo) {
		Scanner sc = new Scanner(System.in);
		String [] randomQues = {};
		String [][] randomOptions = {{}};
		String [] randomRight = {};
		String [] randomExplain = {};
		
		System.out.println("");
		for(int i = 10; i<10; i++) {
			System.out.println(randomQues[i]);
			for(int j = 1; j<4; j++) {
			System.out.println(randomOptions [i][j]);
			}
			String answer = sc.nextLine();
		if (answer == randomRight[i]) {
			System.out.println("That's correct!");
			System.out.println(randomExplain[i]);
			int correctCounter = + 1;
		}
		
		else {
			System.out.println("Oops sorry that is incorrect. The right answer is " + randomRight[i] + "!");
			System.out.println(randomExplain[i]);
		}
		}
	}
	
	public static int TrueOrFalse(int QuesAndInfo) {
		Scanner sc = new Scanner(System.in);
		String [] trueOrFalseQues = {};
		String [] trueOrFalseRight = {};
		String [] trueOrFalseExplain = {};
		
		System.out.println("");
		for(int i = 10; i<10; i++) {
			System.out.println(trueOrFalseQues[i]);
			String answer = sc.nextLine();
		if (answer == trueOrFalseRight[i]) {
			System.out.println("That's correct!");
			System.out.println(trueOrFalseExplain[i]);
			int correctCounter = + 1;
		}
		
		else {
			System.out.println("Oops sorry that is incorrect. The right answer is " + trueOrFalseRight[i] + "!");
			System.out.println(trueOrFalseExplain[i]);
		}
		}
	}
	
	public static int TimHortons(int QuesAndInfo) {
		Scanner sc = new Scanner(System.in);
		String [] timHortonsQues = {};
		String [][] timHortonsOptions = {{}};
		String [] timHortonsRight = {};
		String [] timHortonsExplain = {};
		
		System.out.println("");
		for(int i = 10; i<10; i++) {
			System.out.println(timHortonsQues[i]);
			for(int j = 1; j<4; j++) {
			System.out.println(timHortonsOptions [i][j]);
			}
			String answer = sc.nextLine();
		if (answer == timHortonsRight[i]) {
			System.out.println("That's correct!");
			System.out.println(timHortonsExplain[i]);
			int correctCounter = + 1;
		}
		
		else {
			System.out.println("Oops sorry that is incorrect. The right answer is " + timHortonsRight[i] + "!");
			System.out.println(timHortonsExplain[i]);
		}
		}
	}
	
	public static int FinalTester(int QuesAndInfo) {
		Scanner sc = new Scanner(System.in);
		String [] finalTesterQues = {};
		String [][] finalTesterOptions = {{}};
		String [] finalTesterRight = {};
		String [] finalTesterExplain = {};
		
		System.out.println("");
		for(int i = 10; i<10; i++) {
			System.out.println(finalTesterQues[i]);
			for(int j = 1; j<4; j++) {
			System.out.println(finalTesterOptions [i][j]);
			}
			String answer = sc.nextLine();
		if (answer == finalTesterRight[i]) {
			System.out.println("That's correct!");
			System.out.println(finalTesterExplain[i]);
			int correctCounter = + 1;
		}
		
		else {
			System.out.println("Oops sorry that is incorrect. The right answer is " + finalTesterRight[i] + "!");
			System.out.println(finalTesterExplain[i]);
		}
		}
	}
	
	
	
	
	public static double Average (int avg) {
		
	}

	
	
	
	
	
	
	
	
	
	

}
