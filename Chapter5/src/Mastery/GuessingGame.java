/*

Program: Chapter 4 Mastery GuessingGame         Last Date of this Revision: September 25, 2024

Purpose: Create a number guessing game played between computer and one player.

Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		//Greet user
		System.out.println("Welcome to the number guessing game!"); 
		System.out.println(""); 
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Declare variable and generate random int between 1-20
		int secret = (int)((20 - 1 + 1)* Math.random() + 1); 
		
		//Prompt user for user's guess
		System.out.print("Please enter a number between 1-20: "); 
		
		//Declare variable and record user input
		int usernum = input.nextInt();
		
		//Display secret number and user's guess
		System.out.println("Your guess: " + usernum); 
		System.out.println("Secret number: " + secret); 
		
		//Check if secret number is equal to user's guess.
		
		if (secret == usernum) { //if true, display congratulatory message
			System.out.print("You won!"); 
		}
		
		else { //otherwise, display better luck message
			System.out.println("Better luck next time.");
		}

	}

}

/* Screen Dump

Test Case 1:

Welcome to the number guessing game!

Please enter a number between 1-20: 13
Your guess: 13
Secret number: 2
Better luck next time.


Test Case 2:

Welcome to the number guessing game!

Please enter a number between 1-20: 7
Your guess: 7
Secret number: 17
Better luck next time.

 */
