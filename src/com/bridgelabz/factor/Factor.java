package com.bridgelabz.factor;

import java.util.Scanner;

public class Factor {

	public static void findFactor(int n, int i) {

		// check i less than n
		if (i <= n) {

			// check divisible or not
			if (n % i == 0)
				System.out.print(i + "\t");

			// recursive call to check next number
			findFactor(n, i + 1);

		} // else return

	}

	public static void main(String[] args) {

		// declare variable
		int number = 0;

		// create Scanner object
		Scanner scan = new Scanner(System.in);

		// take input
		System.out.print("Enter a number:: ");
		number = scan.nextInt();

		// find the factor of the number
		System.out.print("The factors are:: ");
		findFactor(number, 1);

		// close Scanner object
		scan.close();
	}

}
