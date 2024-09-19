package SkillBuilders;

import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		
		//Declaration 
		int min,max;
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Prompt and record user input
		System.out.println("Enter a minimum number");
		min = input.nextInt();
		System.out.println("Enter a maximum number");
		max = input.nextInt();
		
		//Generate random numbers
		System.out.println("Random number: " + (int)((max - min + 1)* Math.random() + min));
	
	}

}
