/*

Program: Chapter 9 Mastery EvensAndOdds        Last Date of this Revision: Nov 27, 2024

Purpose: Create a EvensAndOdds application that generates 25 random integers between 0 and 99 
		 and then displays all the evens on one line and all the odds on the next line.

Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 
*/

package Mastery;

public class EvensAndOdds {

	public static void main(String[] args) {
		
		//Initialize and create an int array with 25 elements (25 random numbers).
		int[] numbers = new int[25];
		
		//starting at index 0, for every element in numbers array,
		for (int i = 0; i < numbers.length; i ++) {
			
			//Set correspondent element i to a random number 1 - 99.
			numbers[i] = (int)((100)* Math.random()); 
		}
		
		//section header
		System.out.println("ODD:");
		
		//starting at index 0, for every element in numbers array,
		for (int i = 0; i < numbers.length; i ++) {
			
			//if element i is not divisible by 2 (produces a remainder),
			if ((numbers[i] % 2) != 0) {
				
				//Output number to user
				System.out.print(numbers[i] + " ");
			}
		}
		
		//section header
		System.out.println(" ");
		System.out.println("EVEN:");
		
		//starting at index 0, for every element in numbers array,
		for (int i = 0; i < numbers.length; i ++) {
			
			//if element i is divisible by 2 (no remainders)
			if ((numbers[i] % 2) == 0) {
				
				//Output number to user
				System.out.print(numbers[i] + " ");
			}
		}
	}
}
	


/* Screen Dump

Test Case 1:

ODD:
81 43 23 25 15 17 5 31 3 79 47 93 27 7 77  
EVEN:
60 8 40 22 86 32 88 82 26 80 


Test Case 2:

ODD:
99 77 1 63 31 5 87 89 91 9 89 19 13 33  
EVEN:
20 76 76 48 4 98 44 0 80 24 24 


 */

