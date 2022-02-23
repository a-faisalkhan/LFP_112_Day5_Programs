package com.bridgelabz.quotientandremainder;

import java.util.Scanner;

public class QuotientAndRemainder {
	
	public static void main(String[] args) {
		//int a = 60; 
		//int b = 10; 
		
		System.out.println("Enter the first number");
		Scanner sc = new Scanner(System.in); //for this line import java.util.Scanner; package required
		int number = sc.nextInt(); 
		System.out.println("Enter the second number");
		Scanner sc1 = new Scanner(System.in); //for this line import java.util.Scanner; package required
		int number1 = sc1.nextInt(); 
		
		System.out.println("Quotient : "+ number/number1);
		System.out.println("Remainder : "+ number%number1);
		
		sc.close();
		sc1.close();
	}

}
