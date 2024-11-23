/*

Program: Chapter 7 Mastery LunchOrder        Last Date of this Revision: Nov 10, 2024

Purpose: Create a LunchOrder application that  user for the number of hamburgers, salads,
French fries, and soda and then displays the total for the order.

Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 
*/

package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LunchOrder {

	public static void main(String[] args) {
		
	
	//Greet user
	System.out.println("Welcome to the LunchOrder Application.");
	System.out.println(" ");
	
	//Preparing for user input + format decimal variables
	Scanner input = new Scanner(System.in);
	DecimalFormat shorten = new DecimalFormat("#00.00");
	
	//create Food objects ( With price, fat, carbs, and fiber parameters)
	Food hamburger = new Food(1.85, 9, 33, 1); //create hamburger object
	Food salad = new Food(2, 1, 11, 5); //create salad  object
	Food fries = new Food(1.3, 11, 36, 4); //create fries object
	Food soda = new Food(0.95, 0, 38, 0); //create soda object
	
	//Initialize variables
	int hamburgerNum, saladNum, friesNum, sodaNum;
	double orderTotal;
	
	//For each of the following 4 foods:
		// -- Prompt user for choice and record user input for each type of food
		// -- Display the nutritional value of each food 
	
	System.out.print("Please enter the amount of hamburgers ");
	hamburgerNum = input.nextInt();
	
	System.out.println(" ");
	
	System.out.println("Each hamburger has: ");
	System.out.println(hamburger.getFat() + "g of fat");
	System.out.println(hamburger.getCarbs() + "g of carbs");
	System.out.println(hamburger.getFiber() + "g of fiber");
	
	System.out.println(" ");
	
	System.out.print("Please enter the amount of salad ");
	saladNum = input.nextInt();
	
	System.out.println(" ");
	
	System.out.println("Each salad has: ");
	System.out.println(salad.getFat() + "g of fat");
	System.out.println(salad.getCarbs() + "g of carbs");
	System.out.println(salad.getFiber() + "g of fiber");
	
	System.out.println(" ");
	
	System.out.print("Please enter the amount of fries ");
	friesNum = input.nextInt();
	
	System.out.println(" ");
	
	System.out.println("Each fries has: ");
	System.out.println(fries.getFat() + "g of fat");
	System.out.println(fries.getCarbs() + "g of carbs");
	System.out.println(fries.getFiber() + "g of fiber");
	
	System.out.println(" ");
	
	System.out.print("Please enter the amount of soda ");
	sodaNum = input.nextInt();
	
	System.out.println(" ");
	
	System.out.println("Each soda has: ");
	System.out.println(soda.getFat() + "g of fat");
	System.out.println(soda.getCarbs() + "g of carbs");
	System.out.println(soda.getFiber() + "g of fiber");
	
	System.out.println(" ");
	
	//Calculate total price of order 
	orderTotal = (hamburgerNum * hamburger.getPrice()) + (saladNum * salad.getPrice())
				+ (friesNum * fries.getPrice()) +(sodaNum * soda.getPrice());
	
	//Format decimals and display the total amount if the order to the customer
	System.out.println("Your order comes out to: $" + shorten.format(orderTotal));
	
	
	
	}
}

/* Screen Dump




Test Case 1:
Welcome to the LunchOrder Application.
 
Please enter the amount of hamburgers 456
 
Each hamburger has: 
9.0g of fat
33.0g of carbs
1.0g of fiber
 
Please enter the amount of salad 23
 
Each salad has: 
1.0g of fat
11.0g of carbs
5.0g of fiber
 
Please enter the amount of fries 98
 
Each fries has: 
11.0g of fat
36.0g of carbs
4.0g of fiber
 
Please enter the amount of soda 55
 
Each soda has: 
0.0g of fat
38.0g of carbs
0.0g of fiber
 
Your order comes out to: $1069.25





Test Case 2:
Welcome to the LunchOrder Application.
 
Please enter the amount of hamburgers 3
 
Each hamburger has: 
9.0g of fat
33.0g of carbs
1.0g of fiber
 
Please enter the amount of salad 8
 
Each salad has: 
1.0g of fat
11.0g of carbs
5.0g of fiber
 
Please enter the amount of fries 4
 
Each fries has: 
11.0g of fat
36.0g of carbs
4.0g of fiber
 
Please enter the amount of soda 6
 
Each soda has: 
0.0g of fat
38.0g of carbs
0.0g of fiber
 
Your order comes out to: $32.45


 */

