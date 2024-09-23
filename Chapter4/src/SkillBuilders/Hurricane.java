package SkillBuilders;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//prompt and record user input
		System.out.println("Enter a Hurricane Category: ");		
		int cat = input.nextInt();
		
		
		switch(cat) {
		
		case 1: System.out.println("Category 1: 74-95 mph or 64-82 kt or 119-153km/hr"); break;
		case 2: System.out.println("Category 2: 96-110 mph or 83-95 kt or 154-177km/hr"); break;
		case 3: System.out.println("Category 3: 111-130 mph or 96-113 kt or 178-209km/hr"); break;
		case 4: System.out.println("Category 4: 131-155 mph or 114-135 kt or 210-249km/hr"); break;
		case 5: System.out.println("Category 5: greater than 155mph or 135 kt or 249km/hr"); break;
		default: System.out.println("Please enter a category between 1-5"); 
		
		}

	}

}
