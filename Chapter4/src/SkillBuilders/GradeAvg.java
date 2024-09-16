package SkillBuilders;

import java.util.Scanner;

public class GradeAvg {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Grade Average Calculator. ");
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter your first grade: ");
		int average = userInput.nextInt();
		
		System.out.println("Please enter your second grade: ");
		average = userInput.nextInt() + average;
		
		System.out.println("Please enter your third grade: ");
		average = userInput.nextInt() + average;
		
		System.out.println("Please enter your fourth grade: ");
		average = userInput.nextInt() + average;
		
		System.out.println("Please enter your fifth grade: ");
		average = userInput.nextInt() + average;
		
		average = average / 5;
		System.out.println("The average of your 5 grades is: " + average + "%");
	}

}
