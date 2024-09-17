package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E14Election {

	public static void main(String[] args) {
		
		//Initialize variables of election candidate results
		
		DecimalFormat shorten = new DecimalFormat("#00.00");
		
		int yorka = 314159;
		int yorkm = 271860;
		int jerseya = 89008;
		int jerseym = 121032;
		int connecta = 213451;
		int connectm = 231034;
		
		double awbrey = yorka + jerseya + connecta;
		double martinez = yorkm + jerseym + connectm;
		
		System.out.println("Welcome to the election results window");
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter anything to view recent election results: ");
		String placemat = userInput.next();
		
		System.out.println(" ");
		
		System.out.println("Election results for New York:");
		System.out.println("Awbrey: " + yorka);
		System.out.println("Martinez: " + yorkm);
		
		System.out.println(" ");
		
		System.out.println("Election results for New Jersey:");
		System.out.println("Awbrey: " + jerseya);
		System.out.println("Martinez: " + jerseym);
		
		System.out.println(" ");
		
		System.out.println("Election results for Connecticut:");
		System.out.println("Awbrey: " + connecta);
		System.out.println("Martinez: " + connectm);
		
		System.out.println(" ");
		
		System.out.println("Candidate          Votes   Percentage");
		System.out.println("Awbrey:           " + (int)awbrey + "   "+ shorten.format((awbrey/(awbrey + martinez))*100) + "%");
		System.out.println("Martinez:         " + (int)martinez + "   "+ shorten.format((martinez/(awbrey + martinez))*100) + "%");	
		System.out.println("TOTAL VOTES:     " + (int)(awbrey + martinez));	
	}

}
