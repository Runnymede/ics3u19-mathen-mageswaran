package mageswaran.unit4;

/**
 * ObjectHeight.java
 * This program is to make different mathematical methods
 * January 6, 2020
 * @author Mathen M
 */

public class Mathplus {

	/**Entry point to this program.
	 * @param args unused
	 */

	public static void main(String[] args) {

	}

	
	
	public static int min (int[]values) {
		int min = values[0];
		for(int i = 1; i<values.length; i++) {
			if (values[i]<min) {
				min=values[i];
			}
		}
		return min;
	}
	
	public static int max(int[]values) {
		int max = values[0];
		for(int i = 1; i<values.length; i++) {
			if (values[i]>max) {
				max=values[i];
			}
		}
		return max;
	}
	
	public static int sum(int[]sumFull) {
		int sum = 0;
		for (int i = 0; i<sumFull.length; i++) {
			sum = sum + sumFull[i];
		}
		return sum;
	}
	
	

	public static double average(int[]avg) {
		int sum = 0;
		for (int i = 0; i<avg.length; i++) {
			sum = sum + avg[i];
		}
		int average = sum / avg.length;
		return average;
	}
	
	
	
	
	
	
	public static double min(double[]values) {
		double min = values[0];
		for(int i = 1; i<values.length; i++) {
			if (values[i]<min) {
				min=values[i];
			}
		}
		return min;
	}
	
	public static double max(double[]values) {
		double max = values[0];
		for(int i = 1; i<values.length; i++) {
			if (values[i]>max) {
				max=values[i];
			}
		}
		return max;
	}
	
	public static double sum(double[]sumFull) {
		double sum = 0;
		for (int i = 0; i<sumFull.length; i++) {
			sum = sum + sumFull[i];
		}
		return sum;
	}
	
	public static double average(double[]avg) {
		double sum = 0;
		for (int i = 0; i<avg.length; i++) {
			sum = sum + avg[i];
		}
		double average = sum / avg.length;
		return average;
	}
	
	
	
	public static double median(double[]mid) {
		
	}
	
	public static double mode(double[]most) {
		
	}
	
	public static boolean prime(int xDivide) {
		double limit = Math.sqrt(xDivide);
		int divider = 2;
		double remain = -1;

		do {
			remain = xDivide % divider;
			
			if (remain == 0) {
				break;}
			else
			divider = divider + 1;
			} while (divider <= limit);
		if(remain == 0) {
			return false;
		}
		else {
			return true;	
		}
	}
	
	public static long factorial(int product) {
		for(int i = 0; product>i; product--) {
		}
		long factorial = factorial*product;
		return factorial;
	}
	
	public static int numOfFactors(int ) {
		
	}
	
	public static int[] factors(int mid) {
		
	}
	
	
}
