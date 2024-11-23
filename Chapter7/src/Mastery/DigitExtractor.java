/*

Program: Chapter 7 Mastery DigitExtractor        Last Date of this Revision: Nov 18, 2024

Purpose: Create a DigitExtractor application that prompts the user for an integer and then displays
the ones, tens, and hundreds digit of the number.

Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DigitExtractor {
	
	
	public static void main(String[] args) {
		
		//Greet user
		System.out.println("Welcome to the DigitExtractor application.");
		System.out.println("");
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Initialize variables
		int number;
		String choice;
		boolean cont = true;
		
		
		//Prompt the user for a number + record user input
		System.out.println("Please enter an integer: ");
		number = input.nextInt();
		
		//create num object
		Num num1 = new Num(number);
		
		//While cont is equal to true:
		while (cont == true) {
				
			//Display choices to user
			System.out.println("");
			System.out.println("show (W)hole place number.");
			System.out.println("show (O)nes place number.");
			System.out.println("show (T)ens palce number");
			System.out.println("show (H)undreds place number");
			System.out.println("(Q)uit program");
			System.out.println("");
					
			//Prompt user for choice and record user input
			System.out.print("Please enter your choice to continue: ");
			choice = input.next();
					
			System.out.println("");
					
			//Process choice chosen by user with corresponding case:
			switch(choice.toLowerCase()) {
					
			//Display whole number
			case "w": System.out.println("The whole number is: " + num1.getWhole());break;
			
			//Display number in ones place
			case "o": System.out.println("The ones place digit is: " + num1.getOnes());break;
			
			//Display number in tens place
			case "t": System.out.println("The tens place digit is: " + num1.getTens());break;
			
			//Display number in hundreds place
			case "h": System.out.println("The hundreds place digit is: " + num1.getHundreds());break;
			
			//End program; set cont as false; ending the while loop.
			case "q": System.out.println("Thank you for using DigitExtractor application."); 
					  System.out.println("Have a great day!");
					  cont = false; break;
					  
			//Default case; inform user of error.
			default: System.out.println("Invalid. Please enter a valid choice"); break;
					

			}				
		}
	}
}

/* Screen Dump


Test Case 1:
Welcome to the DigitExtractor application.

Please enter an integer: 
983

show (W)hole place number.
show (O)nes place number.
show (T)ens palce number
show (H)undreds place number
(Q)uit program

Please enter your choice to continue: w

The whole number is: 983

show (W)hole place number.
show (O)nes place number.
show (T)ens palce number
show (H)undreds place number
(Q)uit program

Please enter your choice to continue: o

The ones place digit is: 3

show (W)hole place number.
show (O)nes place number.
show (T)ens palce number
show (H)undreds place number
(Q)uit program

Please enter your choice to continue: t

The tens place digit is: 8

show (W)hole place number.
show (O)nes place number.
show (T)ens palce number
show (H)undreds place number
(Q)uit program

Please enter your choice to continue: 9

Invalid. Please enter a valid choice

show (W)hole place number.
show (O)nes place number.
show (T)ens palce number
show (H)undreds place number
(Q)uit program

Please enter your choice to continue: h

The hundreds place digit is: 9

show (W)hole place number.
show (O)nes place number.
show (T)ens palce number
show (H)undreds place number
(Q)uit program

Please enter your choice to continue: q

Thank you for using DigitExtractor application.
Have a great day!





Test Case 2:
Welcome to the DigitExtractor application.

Please enter an integer: 
12

show (W)hole place number.
show (O)nes place number.
show (T)ens palce number
show (H)undreds place number
(Q)uit program

Please enter your choice to continue: h

The hundreds place digit is: 0

show (W)hole place number.
show (O)nes place number.
show (T)ens palce number
show (H)undreds place number
(Q)uit program

Please enter your choice to continue: t

The tens place digit is: 1

show (W)hole place number.
show (O)nes place number.
show (T)ens palce number
show (H)undreds place number
(Q)uit program

Please enter your choice to continue: o

The ones place digit is: 2

show (W)hole place number.
show (O)nes place number.
show (T)ens palce number
show (H)undreds place number
(Q)uit program

Please enter your choice to continue: w

The whole number is: 12

show (W)hole place number.
show (O)nes place number.
show (T)ens palce number
show (H)undreds place number
(Q)uit program

Please enter your choice to continue: q

Thank you for using DigitExtractor application.
Have a great day!


 */