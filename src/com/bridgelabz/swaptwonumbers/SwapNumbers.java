package com.bridgelabz.swaptwonumbers;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		int x, y, t;// x and y are to swap
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of X :");
		x = sc.nextInt();
		// Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the value of Y :");
		y = sc.nextInt();
		System.out.println("before swapping numbers: " + x + "  " + y);
		// swapping
		t = x;
		x = y;
		y = t;
		System.out.println("After swapping: " + x + "   " + y);
		System.out.println();
	}

}
