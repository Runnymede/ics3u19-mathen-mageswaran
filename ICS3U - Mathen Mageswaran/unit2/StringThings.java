package mageswaran.unit2;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is to find the price print a certain amount of copies 
 * October 8, 2019
 * @author Mathen M
 */

public class StringThings {

	/**entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args)
{
	
	Scanner sc = new Scanner(System.in);
	
	//
	String name;
	System.out.println("Enter your name.");
	name = sc.nextLine();
	String wordie;
	System.out.println("Enter a word that is at least 7 characters long");
	wordie = sc.nextLine();
	

	System.out.println("Your word is " + wordie);
	System.out.println("Your word in all capitals is, " +  wordie.toUpperCase());
	System.out.println("Your word in all lower case is, " + wordie.toLowerCase());
	System.out.println("Your word is, " + wordie.length() + " letters long");
	System.out.println("The 6th letter of your word is, " + wordie.charAt(6));
	
	System.out.println();
	System.out.println();
	
	String twoWordie;
	String threeWordie;
	
	System.out.println("Enter 2 words");
	twoWordie = sc.nextLine();
	threeWordie = sc.nextLine();
	
	System.out.println(twoWordie.compareTo(threeWordie));
	
	if 		((twoWordie.compareTo(threeWordie) == 0))
			{
				System.out.println("Your words are the same.");		
			}
	
	else if  ((twoWordie.compareTo(threeWordie) < 0))
			{
				System.out.println("Your words are not the same. " + threeWordie + " comes before " + twoWordie);
			}
	else	
			{
				System.out.println("Your words are not the same. " + threeWordie + " comes after " + twoWordie);
			}
	
	
	String username = "javaJuice";
	String user;
	String pass;
	String password = "codeCrackers";
	System.out.println("Enter the Username");
	user = sc.nextLine();
	pass = sc.nextLine();
	
	if (username == user && password == pass)
		{
			System.out.println("Welcome " + name);
		}
	else
		{
			System.out.println("The username or pasword is incorrect.");
		}
	
	
	}
	
	
	
}
