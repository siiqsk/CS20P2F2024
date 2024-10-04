/*

Program: Chapter 5 Mastery GroupAssignment         Last Date of this Revision: October 1, 2024

Purpose: Create a group assignment application that prompts the user for his or her name,
		 then displays a group assignment.

Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;

public class GroupAssignment {

	public static void main(String[] args) {

		//Greet user
		System.out.println("Welcome to the group assignment application!"); 
		System.out.println(""); 
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Prompt user for user's guess and record user input
		System.out.print("Please enter your first name: ");
		String firstName = input.next();
		
		System.out.print("Please enter your last name: ");
		String lastName = input.next();
	
		System.out.println(""); 
		
		char inital = lastName.charAt(0);
	
		
		switch (Character.toString(inital).toUpperCase()) {
		
		case "A", "B", "C","D","E","F","G","H","I": System.out.println(firstName + " " + lastName +" is assigned to Group 1"); break;
		case "J","K","L","M","N","O","P","Q","R","S": System.out.println(firstName + " " + lastName +" is assigned to Group 2"); break;
		case "T","U","V","w","X","Y","Z": System.out.println(firstName + " " + lastName +" is assigned to Group 3"); break;
		
		}

	}

}


/* Screen Dump

Test Case 1:

Welcome to the group assignment application!

Please enter your first name: John
Please enter your last name: Doe

John Doe is assigned to Group 1



Test Case 2:
Welcome to the group assignment application!

Please enter your first name: Samantha
Please enter your last name: Sam

Samantha Sam is assigned to Group 2


 */
