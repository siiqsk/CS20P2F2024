package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E11Project {

	public static void main(String[] args) {
		
		DecimalFormat shorten = new DecimalFormat("#00.00");
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter the amount of time spent (in minutes) Designing: ");
		double designing = userInput.nextInt();
		
		System.out.print("Please enter the amount of time spent (in minutes) Coding: ");
		double coding = userInput.nextInt();
		
		System.out.print("Please enter the amount of time spent (in minutes) Debugging: ");
		double debugging = userInput.nextInt();
		
		System.out.print("Please enter the amount of time spent (in minutes) Testing: ");
		double testing = userInput.nextInt();
		
		double all = designing + coding + debugging + testing;
		
		System.out.println("");

		System.out.println("Time spent in...");
		
		System.out.println("");
		
		System.out.println("designing: " + shorten.format((designing / all)*100) + "%" );
		System.out.println("coding: " + shorten.format((coding / all)*100) + "%" );
		System.out.println("debugging: " + shorten.format((debugging / all)*100) + "%" );
		System.out.println("testing: " + shorten.format((testing / all)*100) + "%" );

	}

}
