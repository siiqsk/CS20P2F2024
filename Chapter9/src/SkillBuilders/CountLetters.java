package SkillBuilders;

import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		
		final int LOW = 'A';
		final int HIGH = 'Z';
		
		int[] letterCounts = new int[HIGH - LOW + 1];
		
		Scanner input = new Scanner(System.in);
		
		String phrase;
		char[]phraseLetters;
		int offset;
		
		System.out.print("Enter a phrase: ");
		phrase = input.nextLine();
		
		phrase = phrase.toUpperCase();
		phraseLetters = phrase.toCharArray();
		
		for(char i: phraseLetters) {
			if ((i >= LOW) && (i <= HIGH)) {
				offset = i - LOW;
				letterCounts[offset] ++;
			}
		}
		
		for (int i = LOW; i <= HIGH; i ++) {
			System.out.println((char)i + ": " + letterCounts[i - LOW]);
		}
			
	}

}
