package SkillBuilders;

import java.util.Scanner;

public class NumbersSum {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter any whole number: ");
		int num = input.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i<=num; i ++) {
			System.out.println(i);
			sum = sum + i;
		}
		
		System.out.println("sum: " + sum);


	}

}
