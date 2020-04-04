package com.lab5;
import java.util.*;

public class RainfallApp {

	public static void main(String[] args) {
		//declare local variables
		int[][] rainfall;
		int Max, Min;
		double average;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter number of week: ");
		int weeks = sc.nextInt();
		
		System.out.println("Please number of days per week: ");
		int days = sc.nextInt();
		
		rainfall = new int[weeks][days];
		
		for(int row = 0; row<rainfall.length; row++) {
			for(int col = 0; col<rainfall[row].length;col++) {
				System.out.print("Enter rainfall value for week: " + (row+1) + " day " 
						+ (col+1) + ": ");
				
				rainfall[row][col] = sc.nextInt();
				
			}
			
		}
		
		RainfallAvgMaxMin myAvgMaxMin = new RainfallAvgMaxMin();
		myAvgMaxMin.setRainfall(rainfall);
		
		myAvgMaxMin.calculateAverage();
		myAvgMaxMin.calculateMax();
		myAvgMaxMin.calculateMin();
		
		double a = myAvgMaxMin.getAverage();
		int b = myAvgMaxMin.getMax();
		int c = myAvgMaxMin.getMin();
		
		System.out.println("Average is: " + a);
		System.out.println("Max is: " + b);
		System.out.println("Min is: " + c);

	}//end main

}//end class
