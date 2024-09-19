package SkillBuilders;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		
		//Declaration
		String userName, password;
		
		//Allows you to format any integer
		DecimalFormat dc = new DecimalFormat("0,0");
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//prompt and record user input
		System.out.println("Enter a username: ");		
		userName = input.nextLine();
		userName = userName.toLowerCase();
		
		//prompt and record the user for password
		System.out.println("Enter a password that is at least 8 characters: ");
		password = input.next();
		
		while(password.length() < 8)
		{	
			System.out.println("Eneter a password that is at least 8 characters long");
			password = input.next();
		}
		
		//Convert the password input to lower case characters
		password = password.toLowerCase();
		
		//Display the username and password
		System.out.println("Your name is " + userName +
							"and your password is " +
							password);
		
	}

}
