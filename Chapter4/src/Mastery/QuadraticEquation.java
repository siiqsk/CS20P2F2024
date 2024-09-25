package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		DecimalFormat shorten = new DecimalFormat("#00.00");
		
		System.out.println("Welcome to the Quadratic Equaton Application ");
		System.out.println(" ");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a value for a: "); 
		double a = input.nextDouble();
		
		System.out.print("Please enter a value for b: "); 
		double b = input.nextDouble();
		
		System.out.print("Please enter a value for c: "); 
		double c = input.nextDouble();
		
		double root1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
	
		
		double root2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
		
		
		System.out.println(" ");
		
		System.out.println("The roots are " + shorten.format(root1) + " and " + shorten.format(root2)); 
	}

}
