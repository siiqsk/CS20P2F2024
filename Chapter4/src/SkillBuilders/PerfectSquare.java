package SkillBuilders;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//prompt and record user input
		System.out.println("Please enter an integer number: ");		
		
		double num = input.nextInt();
		
		int after =  (int)(Math.sqrt(num));
		
		int result = (int) (after*after);
		
		System.out.println("");
		
		if (num == result) {
			System.out.println("The integer you entered was a perfect square!");
		}
		
		else {
			System.out.println("The integer you entered was NOT a perfect square.");
		}

	}

}
