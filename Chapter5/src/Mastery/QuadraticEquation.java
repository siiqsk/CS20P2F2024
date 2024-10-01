/*

Program: Chapter 4 Mastery QuadraticEquation        Last Date of this Revision: September 25, 2024

Purpose: Create a QuadraticEquation application that gives the solution to any quadratic equation.
		 
Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		//format decimal variables
		DecimalFormat shorten = new DecimalFormat("#00.00");
		
		//greet user
		System.out.println("Welcome to the Quadratic Equation Application ");
		System.out.println(" ");
		
		//preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Prompt user for values of a,b,c
		//declare variables and record user inputs
		System.out.print("Please enter a value for a: "); 
		double a = input.nextDouble();
		
		System.out.print("Please enter a value for b: "); 
		double b = input.nextDouble();
		
		System.out.print("Please enter a value for c: "); 
		double c = input.nextDouble();
		
		//declare variables and calculate roots 
		double root1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
		double root2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
		
		//Format and display roots of equation to user
		System.out.println(" ");
		System.out.println("The roots are " + shorten.format(root1) + " and " + shorten.format(root2)); 
	}

}

/* Screen Dump

Test Case 1:

Welcome to the Quadratic Equation Application 
 
Please enter a value for a: 33
Please enter a value for b: -6
Please enter a value for c: -23
 
The roots are 00.93 and -00.75




Test Case 2:




 */