/*

Program: Chapter 6 Mastery MetricConversion         Last Date of this Revision: October 16, 2024

Purpose: Create a MetricConversion application that displays a menu of conversion choices and then prompts the user to choose a conversion.

Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MetricConversion {
	
	//**For reference** 
	//i = inches, c = centimeters, f = feet, y = yards, me = meters, mi = miles, k = kilometers
	
	//The following 8 methods calculates the conversion between 2 measurement types with one given length... 
	
	public static double iTOc(double length) { //@param length: length in i - @return (double): length in c
		return(length*2.54);
	}
	
	public static double fTOc(double length) { //@param length: length in f - @return (double): length in c
		return(length*30);
	}
	
	public static double yTOme(double length) { //@param length: length in y - @return (double): length in me
		return(length*0.91);
	}
	
	public static double miTOk(double length) { //@param length: length in mi - @return (double): length in k
		return(length*1.6);
	}
	
	public static double cTOi(double length) { //@param length: length in c - @return (double): length in i
		return(length/2.54);
	}
	
	public static double cTOf(double length) { //@param length: length in c - @return (double): length in f
		return(length/30.0);
	}
	
	public static double meTOy(double length) { //@param length: length in me - @return (double): length in y
		return(length/0.91);
	}
	
	public static double kTOmi(double length) { //@param length: length in k - @return (double): length in mi
		return(length/1.6);
	}

	
	public static void main(String[] args) {
		
		//Initialize variables 
		int choice; 
		double num;
		
		//Preparing for user input + format decimal variables
		Scanner input = new Scanner(System.in);
		DecimalFormat shorten = new DecimalFormat("#00.00");
		
		//Greet user
		System.out.println("Welcome to the MetricConversion program! ");
		System.out.println("");
		
		//Prompt user for number and record user input
		System.out.print("Please enter a number: ");
		num = input.nextDouble();
		
		//Display conversion choices to user
		System.out.println("Convert:");
		System.out.println("1. Inches to Centimeters    5. Centimeters to Inches ");
		System.out.println("2. Feet to Centimeters      6. Centimeters to Feet");
		System.out.println("3. Yards to Meters          7. Meters to Yards");
		System.out.println("4. Miles to Kilometers      8. Kilometers to Miles");
		
		System.out.println("");
		
		//Prompt user for choice and record user input
		System.out.print("Please enter your choice: ");
		choice = input.nextInt();
		
		System.out.println("");
		
		//Determine which conversion (method) to use, then use corresponding method with num variable as parameter. 
		//Shorten decimals + Display conversion result to user
		switch(choice) {
		
		case 1: System.out.println(num+ " inches equals " + shorten.format(iTOc(num)) + " centimeters."); break;
		case 2: System.out.println(num+ " feet equals " + shorten.format(fTOc(num)) + " centimeters."); break;
		case 3: System.out.println(num+ " yards equals " + shorten.format(yTOme(num)) + " meters."); break;
		case 4: System.out.println(num+ " miles equals " + shorten.format(miTOk(num)) + " kilometers."); break;
		case 5: System.out.println(num+ " centimeters equals " + shorten.format(cTOi(num)) + " inches."); break;
		case 6: System.out.println(num+ " centimeters equals " + shorten.format(cTOf(num)) + " feet."); break;
		case 7: System.out.println(num+ " meters equals " + shorten.format(meTOy(num)) + " yards."); break;
		case 8: System.out.println(num+ " kilometers equals " + shorten.format(kTOmi(num)) + " miles."); break;
		
		}

	}

}
	
/* Screen Dump

Test Case 1:

Welcome to the MetricConversion program! 

Please enter a number: 24
Convert:
1. Inches to Centimeters    5. Centimeters to Inches 
2. Feet to Centimeters      6. Centimeters to Feet
3. Yards to Meters          7. Meters to Yards
4. Miles to Kilometers      8. Kilometers to Miles

Please enter your choice: 5

24.0 centimeters equals 09.45 inches.




Test Case 2:

Welcome to the MetricConversion program! 

Please enter a number: 2.6
Convert:
1. Inches to Centimeters    5. Centimeters to Inches 
2. Feet to Centimeters      6. Centimeters to Feet
3. Yards to Meters          7. Meters to Yards
4. Miles to Kilometers      8. Kilometers to Miles

Please enter your choice: 8

2.6 kilometers equals 01.62 miles.


 */
