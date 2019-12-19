package mageswaran.unit4;

import java.util.Scanner;

/**
 * ObjectHeight.java
 * This program is let user print an isoce
 * December 17, 2019
 * @author Mathen M
 */

public class IsoTriangle {

	/**entry point to this program
	 * @param args unused
	 */
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
					
				System.out.println("Enter the size of triangle");
				int n = sc.nextInt();
			
				for(int i = 0; i<n ;i++) {
					for(int x = n-1; x>0; x--) {
					drawSpaces(x);
						for(int z = 0; z<n ;z++) {
							int m = (n*2)-1;
								for(int y = 1; y<m; y+=2) {
									drawStars(y);	
									}		
						}
					}
			}
			}
				
			
				public static void drawSpaces(int n){
				System.out.print(" ");	
				}
			
				public static void drawStars(int n){
				for(int x = )
					System.out.print("*");
				}
				
				
			}
				
				
		
		
