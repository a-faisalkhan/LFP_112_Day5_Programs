package com.bridgelabz.largestamongthreenumbers;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		/*
		 * int a, b, c, largest, temp; // object of the Scanner class Scanner sc = new
		 * Scanner(System.in); // reading input from the user
		 * System.out.println("Enter the first number:"); a = sc.nextInt();
		 * System.out.println("Enter the second number:"); b = sc.nextInt();
		 * System.out.println("Enter the third number:"); c = sc.nextInt(); // comparing
		 * a and b and storing the largest number in a temp variable temp = a > b ? a :
		 * b; // comparing the temp variable with c and storing the result in the
		 * variable largest = c > temp ? c : temp; // prints the largest number
		 * System.out.println("The largest number is: " + largest);
		 */

		// 2. Using if-else..if
		// initializing numbers to compare
		int a = 45, b = 58, c = 85;
		// comparing numbers, a with b and a with c
		// if both conditions are true, prints a
		if (a >= b && a >= c)
			System.out.println(a + " is the largest Number");
		// comparing b with a and b with c
		// if both conditions are true, prints b
		else if (b >= a && b >= c)
			System.out.println(b + " is the largest Number");
		else
			// prints c if the above conditions are false
			System.out.println(c + " is the largest number");

	}

}
