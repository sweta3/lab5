package com.lab5;
import java.util.*;

public class RainfallMinApp {

	public static void main(String[] args) {
		//declare 2D
		double rainfall [] [];
		//set size for 4 weeks 7 days
		rainfall = new double[4][7];
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter number of week: ");
		int weeks = sc.nextInt();
		
		System.out.println("Please number of days per week: ");
		int days = sc.nextInt();
		
		//create a 2D [] with as 7 rows as user provided for weeks 
		//as many col as user provided for days 
		rainfall = new double [weeks][days];
		
		//input 
		//traverse the 2D
		//store the values provided by the user
		for (int row =0; row<rainfall.length;row++){
			for (int col = 0; col<rainfall[row].length;col++) {
				System.out.print("Enter rainfall value for week: " + (row+1) + " day " 
									+ (col+1) + ": ");
				rainfall[row][col] = sc.nextDouble();
			}
		}//end for
		
		//processing 
		//calculate the min value in the []
		double min;
		min = rainfall[0][0];
		
		for(int row = 0; row<rainfall.length; row++) {
			double r[] =rainfall[row];
			for(int col = 0; col<r.length;col++) {
				//if the current element located in the [][]numbers lower
				//than the value stored in the min then update the min with current element 
				if (rainfall[row][col] < min) {
					min=rainfall[row][col];
				}
			}//end for
		}//end loop
		
		//output
		System.out.println("Min is: " + min);
	}//end main
}//end class
