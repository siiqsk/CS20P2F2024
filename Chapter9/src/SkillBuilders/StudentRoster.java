package SkillBuilders;

import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number of students in the class: ");
		int studentAmount = input.nextInt();
		
		String students[] = new String[studentAmount];
		
		for (int i = 0; i < students.length; i ++) {
			System.out.print("Please enter student " + (i+1) + "'s name: ");
			students[i]= input.next();
		}
		
		System.out.println("  ");
		System.out.println("Student Roster: ");
		System.out.println("  ");
		
		for (int i = 0; i < students.length; i ++) {
			System.out.println((i+1) + ". " + students[i]);
		}

	}

}
