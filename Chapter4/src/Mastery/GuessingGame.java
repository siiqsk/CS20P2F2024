package Mastery;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the number guessing game!"); 
		System.out.println(""); 
		
		
		Scanner input = new Scanner(System.in);
		int secret = (int)((20 - 1 + 1)* Math.random() + 1); 
		
		System.out.print("Please enter a number between 1-20: "); 
		int usernum = input.nextInt();
		
		System.out.print("Your guess: " + usernum); 
		System.out.print("Secret number: " + secret); 
		
		if (secret == usernum) {
			System.out.print("You won!"); 
		}
		
		System.out.print(secret);
		
		

	}

}
