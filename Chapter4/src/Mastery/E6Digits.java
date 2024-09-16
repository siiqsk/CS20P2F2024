

package Mastery;

import java.util.Scanner;

public class E6Digits {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a three digit number: ");
		int number = userInput.nextInt();
		int hundreds = number / 100;
		int tens = (number - (hundreds*100))/ 10;
		int ones = (number - ((hundreds*100)+(tens*10)));
		System.out.println("The hundreds place digit is: " + hundreds);
		System.out.println("The tens place digit is: " + tens);
		System.out.println("The ones place digit is: " + ones);
	}

}
