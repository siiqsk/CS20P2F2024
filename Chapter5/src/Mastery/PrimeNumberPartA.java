/*

Program: Chapter 5 Mastery PrimeNumberPartA      Last Date of this Revision: October 1, 2024

Purpose: Create a PrimeNumber application that prompts the user for a number then 
		 displays a message indicating whether the number is prime or not.

Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;

public class PrimeNumberPartA {

	public static void main(String[] args) {
		
		//greet user
		System.out.println("Welcome to the Prime Number application.");
		System.out.println(" ");
		
		//prepare for user input
		Scanner input = new Scanner(System.in);
		
		//Prompt user for number, and record user input in new variable "num"
		System.out.println("Please enter any whole number: ");
		int num = input.nextInt();
		
		//declare and initialize variable 
		int prime = 0;
		
		//for each int number between 2 and num; (i):
		for (int i = 2; i<num; i ++) {
			if (num % i == 0) { //if remainder of num divided by i = 0,
			prime = 1; //set prime variable as 1
			break; //end loop
			}
		}
		
		if (prime == 1) { //if prime is equal to 1
			System.out.print("Your number is NOT a prime number."); //print "non-prime" message
		}
		else {
		System.out.print("Your number IS a prime number!"); //else, print "prime" message
		}

	}

}

/* Screen Dump

Test Case 1:

Welcome to the Prime Number application.
 
Please enter any whole number: 
7
Your number IS a prime number!





Test Case 2:

Welcome to the Prime Number application.
 
Please enter any whole number: 
2394
Your number is NOT a prime number.

 */
