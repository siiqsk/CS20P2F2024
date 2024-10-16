package SkillBuilders;

import java.util.Scanner;

public class Exponentiation {
	
	public static double powerOf(double a, double b) {
		double number = Math.pow(a, b);
		return(number);
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the exponentiation program! ");
		System.out.println("");
		
		System.out.println("Please enter your first number: ");
		int num1 = input.nextInt();
		
		System.out.println("Please enter your second number: ");
		int num2 = input.nextInt();
		
		
		System.out.println(powerOf(num1, num2));

	}

}
