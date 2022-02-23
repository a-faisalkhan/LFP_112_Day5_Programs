package com.bridgelabz.harmonic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HarmonicNumber {
	
		public static void main(String[] args) {
			DecimalFormat decimalFormat = new DecimalFormat("##.00"); //imported import java.text.DecimalFormat; for this line
			
				System.out.println("Type the number for which you want to find harmonic number?");
				Scanner sc = new Scanner(System.in); //for this line import java.util.Scanner; package required
				int number = sc.nextInt(); 
				double harmonicNumber = 0; 
				
				if (number == 0) {
					System.out.println("Invalid input!!!");		
				} else {
					
					for (int i = 1; i <= number; i++) {
				  //harmonicNumber = harmonicNumber + 1/i; 
				    harmonicNumber += (1.0 / i); //same as commented line
					}
					System.out.println("Harmonic number for " + number + " is : " + decimalFormat.format(harmonicNumber));
				}
				sc.close();
		}
}
