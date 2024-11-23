/*
 PiggyBank class of the "MySavings" Chapter 7 Mastery.
 */

package Mastery;

//PiggyBank class to manage number of coins and values in MySavings
public class PiggyBank {
	
	//Initialize private variables
	private int penny, nickel, dime, quarter;
	
	public PiggyBank() { //constructor
		//initialize all coin amounts as 0
		penny = 0;
		nickel = 0;
		dime = 0;
		quarter = 0;
		
	}
	
	//Modifier methods
	
	public void addPenny() { //adds a penny
		penny = penny + 1;
	}
	
	public void addNickel() { //adds a nickel
		nickel = nickel + 1;
	}
	
	public void addDime() { //adds a dime
		dime = dime + 1;
	}
	
	public void addQuarter() { //adds a quarter
		quarter = quarter + 1;
	}
	
	public void removeCoins() { //removes all coins from bank
		penny = 0;
		nickel = 0;
		dime = 0;
		quarter = 0;
	}
	
	//Accesser methods 
	public double getPenny() { //returns number of pennies
		return penny;
	}
	
	public double getNickel() { //returns number of nickels
		return nickel;
	}
	
	public double getDime() { //returns number of dimes
		return dime;
	}
	
	public double getQuarter() { //returns number of quarters
		return quarter;
	}
	
	
	public double total() { //returns total sum of coins in bank
		
		double total;
		total = (penny * 0.01)+(nickel * 0.05)+(dime * 0.1)+(quarter*0.25);
		return total;
		
	}
	
	
	

}
