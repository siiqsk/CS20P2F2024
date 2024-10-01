/*

Program: Chapter 3 Mastery Election          Last Date of this Revision: September 14, 2024

Purpose: Write a program that prompts the user for election results, then displays total results of election.

Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E14Election {

	public static void main(String[] args) {
		
		
		//Format decimal variables
		DecimalFormat shorten = new DecimalFormat("#00.00");
		
		System.out.println("Welcome to the election results window");
		System.out.println(" ");
		
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt the user for # of voters in each state 
		//Declare state variables & Record user inputs
		System.out.println("Please enter the total # of votors for Awbrey in...");
				
		System.out.print("NewYork: ");
		int yorka = userInput.nextInt();
		
		System.out.print("NewJersey: ");
		int jerseya = userInput.nextInt();
		
		System.out.print("Connecticut: ");
		int connecta = userInput.nextInt();
		
		System.out.println(" ");
		
		System.out.println("Please enter the total # of votors for Martinez in...");
		
		System.out.print("NewYork: ");
		int yorkm = userInput.nextInt();
		
		System.out.print("NewJersey: ");
		int jerseym = userInput.nextInt();
		
		System.out.print("Connecticut: ");
		int connectm = userInput.nextInt();
		
		//Take in the sum of votes for each candidate in all states
		double awbrey = yorka + jerseya + connecta;
		double martinez = yorkm + jerseym + connectm;
		
		//Display election results entered by user
		
		System.out.println(" ");
		
		System.out.println("Election results for New York:");
		System.out.println("Awbrey: " + yorka);
		System.out.println("Martinez: " + yorkm);
		
		System.out.println(" ");
		
		System.out.println("Election results for New Jersey:");
		System.out.println("Awbrey: " + jerseya);
		System.out.println("Martinez: " + jerseym);
		
		System.out.println(" ");
		
		System.out.println("Election results for Connecticut:");
		System.out.println("Awbrey: " + connecta);
		System.out.println("Martinez: " + connectm);
		
		System.out.println(" ");
		
		//Calculate and display vote percentages of each candidate
		
		System.out.println("Candidate           Votes   Percentage");
		System.out.println("Awbrey:           " + (int)awbrey + "   "+ shorten.format((awbrey/(awbrey + martinez))*100) + "%");
		System.out.println("Martinez:         " + (int)martinez + "   "+ shorten.format((martinez/(awbrey + martinez))*100) + "%");	
		System.out.println("TOTAL VOTES:     " + (int)(awbrey + martinez));	
	}

}

/* Screen Dump

Test Case 1:

Welcome to the election results window
 
Please enter the total # of votors for Awbrey in...
NewYork: 2345
NewJersey: 23846
Connecticut: 2342
 
Please enter the total # of votors for Martinez in...
NewYork: 8273
NewJersey: 32874
Connecticut: 23847
 
Election results for New York:
Awbrey: 2345
Martinez: 8273
 
Election results for New Jersey:
Awbrey: 23846
Martinez: 32874
 
Election results for Connecticut:
Awbrey: 2342
Martinez: 23847
 
Candidate           Votes   Percentage
Awbrey:           28533   30.51%
Martinez:         64994   69.49%
TOTAL VOTES:     93527




Test Case 2:

Welcome to the election results window
 
Please enter the total # of votors for Awbrey in...
NewYork: 2131
NewJersey: 25
Connecticut: 3425
 
Please enter the total # of votors for Martinez in...
NewYork: 8237
NewJersey: 37
Connecticut: 66
 
Election results for New York:
Awbrey: 2131
Martinez: 8237
 
Election results for New Jersey:
Awbrey: 25
Martinez: 37
 
Election results for Connecticut:
Awbrey: 3425
Martinez: 66
 
Candidate           Votes   Percentage
Awbrey:           5581   40.09%
Martinez:         8340   59.91%
TOTAL VOTES:     13921




 */
