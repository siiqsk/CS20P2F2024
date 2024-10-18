/*

Program: Chapter 6 Mastery PrimeNumber         Last Date of this Revision: October 17, 2024

Purpose: Modify the PrimeNumber application created in Chapter5 Exercise 1 to include a method named isPrime().

Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;

import java.util.Scanner;

public class PrimeNumber {
	
	//This method determines whether a number is prime
	//@param num: number
	//@return: true or false
	public static boolean isPrime(int num) {
		
		//declare and initialize variable 
		int prime = 0;
		
		//for each int number between 2 and num; (i):
		for (int i = 2; i<num; i ++) {
			if (num % i == 0) { //if remainder of num divided by i = 0,
			prime = 1; //set prime variable as 1
			break;}
		}
			
		if (prime != 1) { //if prime is not equal to 1
			return(true); //return true
		}
		
		return(false); //else, return false
	}

	
	public static void main(String[] args) {
		
		//greet user
		System.out.println("Welcome to the Prime Number application.");
		System.out.println(" ");
				
		//prepare for user input
		Scanner input = new Scanner(System.in);
				
		//Prompt user for number, and record user input in new variable "num"
		System.out.print("Please enter any whole number: ");
		int num = input.nextInt();
		
		System.out.println(" ");
		
		if (isPrime(num)== false) { //if isPrime(num) return is equal to false
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
 
Please enter any whole number: 24
 
Your number is NOT a prime number.



Test Case 2:

Welcome to the Prime Number application.
 
Please enter any whole number: 19
 
Your number IS a prime number!


 */

