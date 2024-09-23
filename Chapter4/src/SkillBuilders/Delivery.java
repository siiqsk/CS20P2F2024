package SkillBuilders;

import java.util.*;

public class Delivery {

	public static void main(String[] args) 
	{
		
		Scanner userInput = new Scanner(System.in);
		
		// Declaration and Initialization
		System.out.println("Welcome to the delivery calculator for packages ");
		
		System.out.println(" ");
		
		System.out.print("Please enter a length value for your package: ");
		int length = userInput.nextInt();
		System.out.print("Please enter a width value for your package: ");
		int width = userInput.nextInt();
		System.out.print("Please enter a height value for your package: ");
		int height = userInput.nextInt();
		
		System.out.println(" ");
		
		if ((length<10)&&(width<10)&&(height<10)) {
			System.out.print("Delivery Accepted");}
		else {
			System.out.print("Delivery Rejected");
		}
		
		
	}
}
