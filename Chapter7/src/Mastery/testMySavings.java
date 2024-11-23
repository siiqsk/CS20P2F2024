/*

Program: Chapter 7 Mastery MySavings         Last Date of this Revision: Nov 1, 2024

Purpose: Create a MySavings application that displays a menu of choices for entering
pennies, nickels, dimes, and quarters into a piggy bank and then prompts the user to make a selection.

Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class testMySavings {

	public static void main(String[] args) {
		
		//Greet user
		System.out.println("Welcome to the MySavings Application.");
		
		//Preparing for user input + format decimal variables
		Scanner input = new Scanner(System.in);
		DecimalFormat shorten = new DecimalFormat("#00.00");
		
		//create PiggyBank object
		PiggyBank spot = new PiggyBank() ;
		
		//Initialize variable cont to true
		boolean cont = true;
		
		//While cont is equal to true:
		while (cont == true) {
		
			//Display choices to user
			System.out.println("");
			System.out.println("1. Show total in bank.");
			System.out.println("2. Add a penny.");
			System.out.println("3. Add a nickel.");
			System.out.println("4. Add a dime.");
			System.out.println("5. Add a quarter.");
			System.out.println("6. Take money out of the bank.");
			System.out.println("Enter 0 to quit application");
			System.out.println("");
			
			//Prompt user for choice and record user input
			System.out.print("Please enter your choice to continue: ");
			int choice = input.nextInt();
			
			System.out.println("");
			
			//Process choice chosen by user with corresponding case:
			switch(choice) {
			
			//Display total value of the coins in the user's currect piggy bank.
			case 1: System.out.println("Your total amount in the bank is: $" + shorten.format(spot.total()));
					System.out.println("Pennies: " + spot.getPenny() + " Nickels: " + 
					spot.getNickel()+ " Dimes: " + spot.getDime() + " Quarters: " + spot.getQuarter()); 
					break;
			//Add a penny to the PiggyBank
			case 2: spot.addPenny();
					System.out.println("Successfully added penny"); break;
					
			//Add a nickel to the PiggyBank
			case 3: spot.addNickel();
					System.out.println("Successfully added Nickel"); break;
			
			//Add a Dime to the PiggyBank
			case 4: spot.addDime();
					System.out.println("Successfully added Dime"); break;
			
			//Add a Quarter to the PiggyBank
			case 5: spot.addQuarter();
					System.out.println("Successfully added Quarter"); break;
					
			//Remove all coins from the PiggyBank
			case 6: spot.removeCoins();
					System.out.println("Successfully cleared bank"); break;
			
			//End program; set cont as false; ending the while loop.
			case 0: System.out.println("Thank you for using MySavings application."); 
					System.out.println("Have a great day!");
					cont = false; break;
			
			//Default case; inform user of error.
			default: System.out.println("Invalid. Please enter a choice 1-6."); break;
					
				
		
			}
		}
	}
}

/* Screen Dump




Test Case 1:
Welcome to the MySavings Application.

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 3

Successfully added Nickel

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 7

Invalid. Please enter a choice 1-6.

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 4

Successfully added Dime

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 2

Successfully added penny

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 4

Successfully added Dime

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 5

Successfully added Quarter

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 1

Your total amount in the bank is: $00.51
Pennies: 1.0 Nickels: 1.0 Dimes: 2.0 Quarters: 1.0

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 2

Successfully added penny

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 6

Successfully cleared bank

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 1

Your total amount in the bank is: $00.00
Pennies: 0.0 Nickels: 0.0 Dimes: 0.0 Quarters: 0.0

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 0

Thank you for using MySavings application.
Have a great day!






Test Case 2:
Welcome to the MySavings Application.

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 1

Your total amount in the bank is: $00.00
Pennies: 0.0 Nickels: 0.0 Dimes: 0.0 Quarters: 0.0

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 2

Successfully added penny

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 3

Successfully added Nickel

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 4

Successfully added Dime

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 5

Successfully added Quarter

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 1

Your total amount in the bank is: $00.41
Pennies: 1.0 Nickels: 1.0 Dimes: 1.0 Quarters: 1.0

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 6

Successfully cleared bank

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 1

Your total amount in the bank is: $00.00
Pennies: 0.0 Nickels: 0.0 Dimes: 0.0 Quarters: 0.0

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of the bank.
Enter 0 to quit application

Please enter your choice to continue: 0

Thank you for using MySavings application.
Have a great day!



 */
