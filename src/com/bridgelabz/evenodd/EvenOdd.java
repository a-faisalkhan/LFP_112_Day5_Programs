package com.bridgelabz.evenodd;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number :");
		int x = sc.nextInt();

		if (x % 2 == 0) {

			System.out.println("number " + x + " is even number");
		} else {
			System.out.println("number " + x + " is odd number");

		}
	}

}
