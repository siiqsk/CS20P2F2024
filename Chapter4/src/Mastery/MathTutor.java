

package Mastery;

import java.util.Scanner;

public class MathTutor {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Math Tutor Application ");
		System.out.println(" ");
		
		Scanner input = new Scanner(System.in);
		
		int one = (int)((10 - 1 + 1)* Math.random() + 1);
		double two = (int)((10 - 1 + 1)* Math.random() + 1);
		
		int operator = (int)((4 - 1 + 1)* Math.random() + 1);
		
		double answer = 0;
		
		switch (operator) {
		case 1: System.out.println("What is " + one + " x " + (int)two + "?"); 
				answer = (one*two);break;
				
		case 2: System.out.println("What is " + one + " + " + (int)two + "?"); 
				answer = (one+two); break;
				
		case 3: System.out.println("What is " + one + " - " + (int)two + "?");
				answer = (one-two); break;
				
		case 4: System.out.println("What is " + one + " / " + (int)two + "?"); 
				answer = (one/two); break;
		}
		
		double useranswer = input.nextDouble();
		
		System.out.println(" ");
		
		if (useranswer == answer) {
			System.out.println("Correct !");	
		}
		
		else {
			System.out.println("Incorrect !");
		}
		
		System.out.println(" ");
		
		System.out.println("(Your answer: " + useranswer + ")");
		System.out.println("(Correct answer: " + answer + ")");
		
		
	}

}
