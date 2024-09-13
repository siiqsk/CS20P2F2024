package SkillBuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter a two digit number: ");
		int number = userInput.nextInt();
		int tens = number / 10;
		int ones = number - (tens*10);
		System.out.println("The number in the ones place is a: " + ones );
		System.out.println("The number in the tens place is a: " + tens );
	}

}
