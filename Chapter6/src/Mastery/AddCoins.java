/*

Program: Chapter 6 Mastery AddCoins         Last Date of this Revision: October 18, 2024

Purpose: Create an AddCoins application that prompts the user for the number of pennies,
nickels, dimes, and quarters, and then displays their total dollar amount.

Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AddCoins {

	public static String getDollarAmount(int p, int n, int d, int q) {
		
		double total = ((p * 0.01)+(n * 0.05)+(d * 0.1)+(q * 0.25));
		return ("$" + Double.toString(total));
		
	}
	
	public static void main(String[] args) {
		//Initialize variables 
		int p, n, d, q; 
				
		//Preparing for user input + format decimal variables
		Scanner input = new Scanner(System.in);
		
				
		//Greet user
		System.out.println("Welcome to the AddCoins program! ");
		System.out.println("");
				
		//Prompt user for number and record user input
		System.out.println("Enter your total coins... ");
		System.out.println("");
		
		System.out.print("Quarters: ");
		q = input.nextInt();
		
		System.out.print("Dimes: ");
		d = input.nextInt();
		
		System.out.print("Nickels: ");
		n = input.nextInt();
		
		System.out.print("Pennies: ");
		p = input.nextInt();
		
		System.out.println("");
		System.out.println("Your total dollar amount is: " + getDollarAmount(p,n,d,q));
		

	}

}
