package Mastery;

//Num object to calculate place values in DigitExtractor
public class Num {
	
	//Initialize private variables
	private int number, ones, tens, hundreds;
	
	public Num() { //default constructor
		number = 0; //Initialize variable as 0
		placeValues();
	}

	public Num(int newNum) { 
	//overload the default constructor method
		number = newNum;
		placeValues();
	}
	
	//Calculate place values
	public void placeValues() {
		hundreds = number / 100;
		tens = (number % 100)/ 10;
		ones = (number % 10);
	}
	
	//Accesser methods:
	public int getHundreds() { //hundreds place number
		return hundreds;
	}
	
	public int getTens() { //tens place number
		return tens;
	}
	

	public int getOnes() { // ones place number
		return ones;
	}
	
	public int getWhole() { //whole number
		return number;
	}
	
	

}
