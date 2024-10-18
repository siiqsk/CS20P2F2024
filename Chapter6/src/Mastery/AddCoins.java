/*

Program: Chapter 6 Mastery AddCoins         Last Date of this Revision: October 18, 2024

Purpose: Create an AddCoins application that prompts the user for the number of pennies,
nickels, dimes, and quarters, and then displays their total dollar amount.

Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;


	
public class AddCoins {
	
	
	//This method calculates the total value of given coins
	//@param (int) p, n, d, q: amount of each corresponding coin type
	//@return: "$" + total value
	public static String getDollarAmount(int p, int n, int d, int q) {
		
		//Multiply # of coins by corresponding values, and calculate sum.
		//store sum in double variable total
		double total = ((p * 0.01)+(n * 0.05)+(d * 0.1)+(q * 0.25));
		
		//return dollar amount
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
		System.out.println("Enter your total coins... ");
		System.out.println("");
		
		//Prompt user for # of coins for each corresponding type, and record user input.
		System.out.print("Quarters: "); 
		q = input.nextInt();
		
		System.out.print("Dimes: ");
		d = input.nextInt();
		
		System.out.print("Nickels: ");
		n = input.nextInt();
		
		System.out.print("Pennies: ");
		p = input.nextInt();
		
		//Display dollar amount; return value of method getDollarAmount(p,n,d,q)
		System.out.println("");
		System.out.println("Your total dollar amount is: " + getDollarAmount(p,n,d,q));
		

	}

}

/* Screen Dump

Test Case 1:

Welcome to the AddCoins program! 

Enter your total coins... 

Quarters: 3
Dimes: 8
Nickels: 3
Pennies: 7

Your total dollar amount is: $1.77



Test Case 2:

Welcome to the AddCoins program! 

Enter your total coins... 

Quarters: 4
Dimes: 6
Nickels: 3
Pennies: 6

Your total dollar amount is: $1.81

 */

