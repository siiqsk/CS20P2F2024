/*

Program: Chapter 4 Mastery MathTutor        Last Date of this Revision: September 25, 2024

Purpose: Create a math tutor application that displays math problems by randomly generating two numbers (1-10)
		 and an operator (+,-,*,/), then prompts user for answer.
		 
Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathTutor {

	public static void main(String[] args) {
		
		//format decimal variables
		DecimalFormat shorten = new DecimalFormat("#00.00");
		
		//greet user
		System.out.println("Welcome to the Math Tutor Application ");
		System.out.println(" ");
		
		//preparing for user input
		Scanner input = new Scanner(System.in);
		
		//declare and generate random numbers between 1-10; int & double
		int one = (int)((10 - 1 + 1)* Math.random() + 1);
		double two = (int)((10 - 1 + 1)* Math.random() + 1);
		
		//declare and generate random number int 1-4
		int operator = (int)((4 - 1 + 1)* Math.random() + 1);
		
		//declare and initialize variable
		double answer = 0;
		
		//Determine which operation to use, and prompt user for math question answer
		switch (operator) {
		case 1: System.out.println("What is " + one + " x " + (int)two + "?"); 
				answer = (one*two);break;
				
		case 2: System.out.println("What is " + one + " + " + (int)two + "?"); 
				answer = (one+two); break;
				
		case 3: System.out.println("What is " + one + " - " + (int)two + "?");
				answer = (one-two); break;
				
		case 4: System.out.println("What is " + one + " / " + (int)two + "?"); 
				answer = (one/two); break;
		}
		
		//Declare variable and record user input
		double useranswer = input.nextDouble();
		
		System.out.println(" ");
		
		//Check if variables are the same
		if (useranswer == answer) { //if true, display "correct" to user
			System.out.println("Correct !");	
		}
		
		else {
			System.out.println("Incorrect !"); //if false, display "incorrect" to user
		}
		
		System.out.println(" ");
		
		//format and display answer and user input
		System.out.println("(Your answer: " + shorten.format(useranswer) + ")");
		System.out.println("(Correct answer: " + shorten.format(answer) + ")");
		
		
	}

}

/* Screen Dump

Test Case 1:

Welcome to the Math Tutor Application 
 
What is 10 x 2?
20
 
Correct !
 
(Your answer: 20.00)
(Correct answer: 20.00)



Test Case 2:

Welcome to the Math Tutor Application 
 
What is 9 - 6?
5
 
Incorrect !
 
(Your answer: 05.00)
(Correct answer: 03.00)


 */
