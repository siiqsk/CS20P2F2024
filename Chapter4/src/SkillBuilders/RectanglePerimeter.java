package SkillBuilders;

import java.util.*;

public class RectanglePerimeter {

	public static void main(String[] args) 
	{
		
		Scanner userInput = new Scanner(System.in);
		
		// Declaration and Initialization
		System.out.print("Please enter a length value: ");
		int length = userInput.nextInt();
		System.out.print("Please enter a width value: ");
		int width = userInput.nextInt();
		
		int area = length * width;
		
		System.out.print("The area of the retangle is: " + area);
		
	}
}
