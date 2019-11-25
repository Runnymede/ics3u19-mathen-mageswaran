package mageswaran.unit2;

/**
 * ObjectHeight.java
 * This program is to count down from 10 and print "Blast off"
 * November 11, 2019
 * @author Mathen M 
 */

public class CountDown {

	/**entry point to this program
	 * @param args unused
	 * @throws InterruptedException 
	 */

	public static void main(String[] args) throws InterruptedException {

		for (int count = 10; count > 0; count--)
		{
			System.out.println(count);
			Thread.sleep(1000);
		}
		System.out.println("Blast off");
		
		
		
		
		
		
		
	}

}
