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
	
	
	public static double iTOc(double length) {
		return(length*2.54);
	}
	
	public static double fTOc(double length) {
		return(length*30);
	}
	
	public static double yTOme(double length) {
		return(length*0.91);
	}
	
	public static double miTOk(double length) {
		return(length*1.6);
	}
	
	public static double cTOi(double length) {
		return(length/2.54);
	}
	
	public static double cTOf(double length) {
		return(length/30.0);
	}
	
	public static double meTOy(double length) {
		return(length/0.91);
	}
	
	public static double kTOmi(double length) {
		return(length/1.6);
	}

	
	public static void main(String[] args) {
		
		int choice; 
		double num;
		
		Scanner input = new Scanner(System.in);
		DecimalFormat shorten = new DecimalFormat("#00.00");
		
		System.out.println("Welcome to the MetricConversion program! ");
		System.out.println("");
		
		System.out.println("Please enter a number: ");
		num = input.nextDouble();
		
		System.out.println("Convert:");
		System.out.println("1. Inches to Centimeters    5. Centimeters to Inches ");
		System.out.println("2. Feet to Centimeters      6. Centimeters to Feet");
		System.out.println("3. Yards to Meters          7. Meters to Yards");
		System.out.println("4. Miles to Kilometers      8. Kilometers to Miles");
		
		System.out.println("");
		
		System.out.println("Please enter your choice: ");
		
		choice = input.nextInt();
		
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
