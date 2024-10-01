/*

Program: Chapter 3 Mastery Project          Last Date of this Revision: September 13, 2024

Purpose: Create an application to help analyze the time taken for a Java Project.

Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E11Project {

	public static void main(String[] args) {
		
		
		//Format decimal variables
		DecimalFormat shorten = new DecimalFormat("#00.00");
		
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//prompt the user & declare variables + record user inputs
		System.out.print("Please enter the amount of time spent (in minutes) Designing: ");
		double designing = userInput.nextInt();
		
		System.out.print("Please enter the amount of time spent (in minutes) Coding: ");
		double coding = userInput.nextInt();
		
		System.out.print("Please enter the amount of time spent (in minutes) Debugging: ");
		double debugging = userInput.nextInt();
		
		System.out.print("Please enter the amount of time spent (in minutes) Testing: ");
		double testing = userInput.nextInt();
		
		//Take the total sum of all variables entered by user
		double all = designing + coding + debugging + testing;
		
		//*code for cosmetic purposes*
		System.out.println("");
		System.out.println("Time spent in...");
		System.out.println("");
		
		//Divide each user input by sum to obtain percentage of sum. Display percentages to user.
		System.out.println("designing: " + shorten.format((designing / all)*100) + "%" );
		System.out.println("coding: " + shorten.format((coding / all)*100) + "%" );
		System.out.println("debugging: " + shorten.format((debugging / all)*100) + "%" );
		System.out.println("testing: " + shorten.format((testing / all)*100) + "%" );

	}

}
