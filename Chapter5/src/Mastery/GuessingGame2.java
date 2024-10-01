/*

Program: Chapter 5 Mastery GuessingGame        Last Date of this Revision: October 1, 2024

Purpose: Modify the guessing game in chapter 4 to allow for as many guesses as needed.

Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;

public class GuessingGame2 {

	public static void main(String[] args) {
		
				//Greet user
				System.out.println("Welcome to the number guessing game!"); 
				System.out.println(""); 
				
				//Preparing for user input
				Scanner input = new Scanner(System.in);
				
				//Declare variable and generate random int between 1-20
				int secret = (int)((20 - 1 + 1)* Math.random() + 1); 
				
				//Prompt user for user's guess and record user input
				System.out.print("Please enter a number between 1-20: ");
				int usernum = input.nextInt();
				
				//while loop remains true, unless stopped by break.
				while(true) {
					if (secret == usernum) { //Check if secret number is equal to user's guess.
						System.out.print("You won!"); //if true, display congratulatory message
						break; //break loop
					}
					
					else { //if false,
						System.out.println("WRONG. Try again."); //Display "wrong" message
						System.out.print("Please enter a number between 1-20: "); //Prompt user to re-enter guess
						usernum = input.nextInt(); //overwrite and record user input
					}
				}
		
	}

}

/* Screen Dump

Test Case 1:

Welcome to the number guessing game!

Please enter a number between 1-20: 1
WRONG. Try again.
Please enter a number between 1-20: 2
WRONG. Try again.
Please enter a number between 1-20: 3
WRONG. Try again.
Please enter a number between 1-20: 4
WRONG. Try again.
Please enter a number between 1-20: 5
WRONG. Try again.
Please enter a number between 1-20: 6
WRONG. Try again.
Please enter a number between 1-20: 7
WRONG. Try again.
Please enter a number between 1-20: 8
WRONG. Try again.
Please enter a number between 1-20: 9
WRONG. Try again.
Please enter a number between 1-20: 10
WRONG. Try again.
Please enter a number between 1-20: 11
WRONG. Try again.
Please enter a number between 1-20: 12
WRONG. Try again.
Please enter a number between 1-20: 13
WRONG. Try again.
Please enter a number between 1-20: 14
You won!






Test Case 2:
Welcome to the number guessing game!

Please enter a number between 1-20: 1
WRONG. Try again.
Please enter a number between 1-20: 2
WRONG. Try again.
Please enter a number between 1-20: 3
WRONG. Try again.
Please enter a number between 1-20: 4
WRONG. Try again.
Please enter a number between 1-20: 5
WRONG. Try again.
Please enter a number between 1-20: 6
WRONG. Try again.
Please enter a number between 1-20: 7
WRONG. Try again.
Please enter a number between 1-20: 8
WRONG. Try again.
Please enter a number between 1-20: 9
You won!

 */
