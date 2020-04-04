package com.lab5;

public class ArrayDemo {

	//declare data members 
	private int nums[][];

	//constructor
	public ArrayDemo() {
	}

	//constructor with parameters
//	public ArrayDemo(int[][] nums) {
//		this.nums = nums;
//	}
	//getter
	public int[][] getNums() {
		return nums;
	}
	//setter
	public void setNums(int[][] nums) {
		this.nums = nums;
	}
	
	public void setArrayNumber(int row, int col, int num) {
		nums[row][col] = num;
	}
	
	
}
