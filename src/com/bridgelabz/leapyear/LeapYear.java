package com.bridgelabz.leapyear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter  any  calendar year :");
		
		year = sc.nextInt();
		
//		if (year > 1000 && year <9999) {
		
		//if (year != 0) {
		
		if (year >= 1000 && year <= 9999) {
			
			if (year % 400 == 0)
				System.out.println(year + " is a leap year");
			
			else if (year % 100 != 0) {
				
				if (year % 4 == 0)
					
					System.out.println(year + " is a leap year");
				
				else
					System.out.println(year + " is not a leap year");
				
			} else
				System.out.println(year + " is not a leap year");
			
		} else
			System.out.println("Enter year between 1000 to 9999");
			sc.close(); 

	}

}
