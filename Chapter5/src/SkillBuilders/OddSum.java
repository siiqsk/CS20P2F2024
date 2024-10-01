package SkillBuilders;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter any whole number: ");
		int num = input.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i<=num; i ++) {
			
			if (i%2 != 0) {
			
			sum = sum + i;
			}
			
		}
		
		System.out.println("sum: " + sum);

	}

}
