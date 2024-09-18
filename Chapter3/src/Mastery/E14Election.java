package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E14Election {

	public static void main(String[] args) {
		
		//Initialize variables of election candidate results
		
		DecimalFormat shorten = new DecimalFormat("#00.00");
		
		System.out.println("Welcome to the election results window");
		System.out.println(" ");
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter the total # of votors for Awbrey in...");
				
		System.out.print("NewYork: ");
		int yorka = userInput.nextInt();
		
		System.out.print("NewJersey: ");
		int jerseya = userInput.nextInt();
		
		System.out.print("Connecticut: ");
		int connecta = userInput.nextInt();
		
		System.out.println(" ");
		System.out.println("Please enter the total # of votors for Martinez in...");
		
		System.out.print("NewYork: ");
		int yorkm = userInput.nextInt();
		
		System.out.print("NewJersey: ");
		int jerseym = userInput.nextInt();
		
		System.out.print("Connecticut: ");
		int connectm = userInput.nextInt();
		
		
		double awbrey = yorka + jerseya + connecta;
		double martinez = yorkm + jerseym + connectm;
		
		
		
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
		
		System.out.println("Candidate           Votes   Percentage");
		System.out.println("Awbrey:           " + (int)awbrey + "   "+ shorten.format((awbrey/(awbrey + martinez))*100) + "%");
		System.out.println("Martinez:         " + (int)martinez + "   "+ shorten.format((martinez/(awbrey + martinez))*100) + "%");	
		System.out.println("TOTAL VOTES:     " + (int)(awbrey + martinez));	
	}

}
