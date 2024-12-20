/*

Program: Chapter 9 Mastery Palindrome        Last Date of this Revision: Nov 29, 2024

Purpose: Create a Palindrome application that prompts the user for a string and then displays
		 a message indicating whether or not the string is a Palindrome.

Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 
*/

package Mastery;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
	

	public static void main(String[] args) {
		
		//greet user
		System.out.println("Welcome to the Palindrome application! ");
		
		System.out.println("  ");
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Initialize variables
		final int LOW = 'A';
		final int HIGH = 'Z';
		String phrase;
		
		//Prompt user for phrase + record user input
		System.out.print("Enter a phrase: ");
		phrase = input.nextLine();
		
		//Convert phrase to only upper-case letters
		phrase = phrase.toUpperCase();
		
		//Create array lists; one for og phrase, one for reversed phrase.
		ArrayList<Character> phraseLetters = new ArrayList<>();
		ArrayList<Character> reverseLetters = new ArrayList<>();
		
		//starting at index 0, for every character in the variable phrase,
		for(int i = 0; i < phrase.length(); i++){
			
			//if the character is in the bounds of A - Z,
			if ((phrase.charAt(i)>= LOW) && (phrase.charAt(i) <= HIGH) ) {
				
				//Add the letter(char) into the og array-list.
				phraseLetters.add(phrase.charAt(i));
			}
		}
		
		//section header
		System.out.println(" ");
		System.out.println("Original order: " + phraseLetters);
		
		//starting at the last index of the array-list, 
		//for every char object(descending order),
		for (int i = (phraseLetters.size() - 1); i >= 0; i --){
			
			//Add the same char at index i into the reverse array-list
			reverseLetters.add(phraseLetters.get(i));
			
		}
		
		//section header
		System.out.println("Reverse order: " + reverseLetters);
		System.out.println(" ");
		
		//if the og array-list is equal to the reversed array-list,
		if (phraseLetters.equals(reverseLetters) == true) {
			
			//Display positive palindrome result,
			System.out.println("Your phrase is a palindrome!");
		}
		
		else { //if not true,
			
			//Display negative palindrome result.
			System.out.println("Your phrase is not a palindrome!");
		}

	}

}

/* Screen Dump

Test Case 1:

Enter a phrase: racecar
 
Original order: [R, A, C, E, C, A, R]
Reverse order: [R, A, C, E, C, A, R]
 
Your phrase is a palindrome!



Test Case 2:

Enter a phrase: Never odd or even
 
Original order: [N, E, V, E, R, O, D, D, O, R, E, V, E, N]
Reverse order: [N, E, V, E, R, O, D, D, O, R, E, V, E, N]
 
Your phrase is a palindrome!


 */

