/*

Program: Chapter 3 Mastery Digits          Last Date of this Revision: September 14, 2024

Purpose: A modified version of the Digits Application that shows the hundreds place digit of a 3 digit number.

Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;

import java.util.Scanner;

public class E6Digits {

	public static void main(String[] args) {
		
		
			//Preparing for user input
			Scanner userInput = new Scanner(System.in);
			
			//Prompt the user for a number
			System.out.println("Please enter a three digit number: ");
			
			//Declare variable and record user input
			int number = userInput.nextInt();
			
			//Declare and calculate variable values of places
			int hundreds = number / 100;
			int tens = (number - (hundreds*100))/ 10;
			int ones = (number - ((hundreds*100)+(tens*10)));
			
			//Display results to user
			System.out.println("The hundreds place digit is: " + hundreds);
			System.out.println("The tens place digit is: " + tens);
			System.out.println("The ones place digit is: " + ones);

	}

}
