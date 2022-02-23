package com.bridgelabz.Array;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
	
	//int number [] = new int [10]; 
	//int [] number = new int [10]; //for 1D array
	  int [][] number; 
	
	public TwoDArray (int row, int col) {
		
		number = new int [row][col]; //to store user's input in row and column
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number of the row : ");
		int row = sc.nextInt(); 
		
		System.out.println("Enter the number of column : ");
		int col = sc.nextInt(); 
		
		TwoDArray twoDArray = new TwoDArray(row,col); 
		twoDArray.saveNumbers(row, col); 
		
		System.out.println("-------Printing an Array to file------");
		twoDArray.printArray(row, col);
		
		//System.out.println(twoDArray.number [0][0]);
		
		sc.close();
		}
	private void printArray(int row, int col) {
		try {
			PrintWriter writer = new PrintWriter("Matrix.text");
			
			for (int i = 0; i < row; i++) {
				for (int j = 0; j <  col; j++) {
					writer.print(number [i][j] + "\t");
					//System.out.print(number [i][j] + "\t"); // \t is used for Tab space
				}
				
				//System.out.print("\n"); //\n is used for new line
				writer.print("\n");
			}
			writer.close(); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	private void saveNumbers(int row, int col) {
		
		Scanner sc = new Scanner(System.in); 
		//System.out.println(number.length); //to print the length
		
		
		for (int i = 0; i < row ; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter the ["+i+"]["+j+"] : ");
				number [i][j] = sc.nextInt();
				
			}
		}
			
			sc.close();
	}
		
}
