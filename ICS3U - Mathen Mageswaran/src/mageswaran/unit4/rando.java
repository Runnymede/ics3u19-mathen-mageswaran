package mageswaran.unit4;
import java.awt.Color;
import hsa_new.Console;
import java.util.Scanner;

public class rando {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Facts & Curious, your very own learning world to drift through! What's your name?");
		String name = sc.nextLine();
		System.out.println("Hey " + name + "! You can chose from a variety of fun topics and questioniong methods to quiz yourself and learn from.");
		System.out.println("Which of these would you like to try?");
		System.out.println("");
		System.out.println("1) Space, 2) Biology, 3) True or False");
		System.out.println("4) Mathematics, 5) Random, 6) Tim Hortons ");	
		System.out.println("7) Final Test");
		System.out.println("");
		System.out.println("Enter the number of the topic that you would like to try.");
		System.out.println("We would recommend that you try at least 2 other tests before racing towards the Final Test");
		String test = sc.nextLine();
		
		System.out.println("Biology! Good choice.");
		System.out.println("What is the biggest");
		
		String ANSI_RESET = "\u001B[0m";
		String ANSI_RED = "\u001B[31m";
		sc.setTextBackgroundColor(Color.GREEN);
		

	}

}
