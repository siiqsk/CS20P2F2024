package SkillBuilders;

import java.util.Scanner;

public class TimeConverter {

		
		public static void hoursToMins() {
			double hour, min;
			Scanner input = new Scanner(System.in);
			
			System.out.println("Please enter your time in hours: ");
			hour = input.nextInt();
			
			min = hour*60;
			
			System.out.println("Your time in minutes is: " + min);	
		}
		
		public static void daysToHours() {
			double day, hour;
			Scanner input = new Scanner(System.in);
			
			System.out.println("Please enter your time in days: ");
			day = input.nextInt();
			
			hour = day*24;
			
			System.out.println("Your time in hours is: " + hour);	
		}
		
		public static void minsToHours() {
			double min, hour;
			Scanner input = new Scanner(System.in);
			
			System.out.println("Please enter your time in minutes: ");
			min = input.nextInt();
			
			hour = min/60 ;
			
			System.out.println("Your time in hours is: " + hour);	
		}
		
		public static void hoursToDays() {
			double day, hour;
			Scanner input = new Scanner(System.in);
			
			System.out.println("Please enter your time in hours: ");
			hour = input.nextInt();
			
			day = hour/24;
			
			System.out.println("Your time in days is: " + day);	
		}
		
		
		public static void main(String[] args) {
			int choice;
			Scanner input = new Scanner(System.in);
			
			System.out.println("Welcome to the time converter program! ");
			System.out.println("");
			
			System.out.println("Please enter a number in correspondent to the type of conversion: ");
			System.out.println("1. Hours to minutes ");
			System.out.println("2. Days to hours ");
			System.out.println("3. Minutes to hours ");
			System.out.println("4. hours to days ");
			System.out.println("");
			
			System.out.println("Please enter your choice: ");
			
			choice = input.nextInt();
			if (choice == 1) {
				hoursToMins();
			} else if (choice == 2) {
				daysToHours();
			} else if (choice == 3) {
				minsToHours();
			} else {
				hoursToDays();
			}
			
			

	}

}
