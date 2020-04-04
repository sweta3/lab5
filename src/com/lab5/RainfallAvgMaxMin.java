package com.lab5;

public class RainfallAvgMaxMin {
	//declare instance variables
	private int rainfall[][];
	private double average;
	private int min;
	private int max;

	//declare default constructor
	public RainfallAvgMaxMin() {
	}

	//setter
	public void setRainfall(int[][] rainfall) {
		this.rainfall = rainfall;
	}
	
	//calculate average
	public void calculateAverage() {
		int sum; //to store the sum of elements of 2D[][]
		int counter = 0; //the number of elements in the 2D array 
		
		sum = 0;
		for (int row = 0; row<rainfall.length;row++) {
			for (int col = 0; col<rainfall[row].length;col++) {
				sum = sum + rainfall[row][col];	
				
				//another element has been added to the sum
				//the element from [row][col]
				counter++;
			}
			//compute
			average=(double)sum/counter;
		}
		
	}
	//getter
	public double getAverage() {
		return average;
	}
	
	//calculate min
	public void calculateMin() {
		min = rainfall[0][0];
		
		for(int row = 0; row < rainfall.length;row++) {
			int[] r = rainfall[row];
			for(int col = 0; col<r.length;col++) {
				if(rainfall[row][col]<min) {
					min = rainfall[row][col];
				}
				
			}
			
		}
	}
	//getter
	public int getMin() {
		return min;
	}
	
	//calculate max
	public void calculateMax() {
		max = rainfall[0][0];
		
		for(int row = 0; row<rainfall.length; row++) {
			for(int col = 0; col<rainfall[row].length;col++) {
				if(rainfall[row][col]>max) {
					max=rainfall[row][col];
				}
			}
		}
	}
	//getter

	public int getMax() {
		return max;
	}
}
