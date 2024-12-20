/*

Program: Chapter 9 Mastery CourseGrades        Last Date of this Revision: Nov 25, 2024

Purpose: Create a CourseGrades application that stimulates a grade book for a class with
         12 students that each have 5 test scores.

Author: Sophia Chen, 
School: CHHS
Course: Computer Programming 20
 
*/

package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GradeBook {
	
	//Preparing for user input
	static Scanner input = new Scanner(System.in);
	
	//Initialize final variables
	static final int students = 12;
	static final int tests = 5;
	
	//Initialize and create 2-d array to store grades;
	//with 12 rows (students), and 5 columns (tests)
	private static int[][] grades = new int[students][tests];
	
	//This method gets the grades for each student from the teacher
	//@param n/a
	//@return: void
	public static void getGrades(){
		
		//for each student in the students variable
		for (int s = 0; s < students; s ++) {
			
			//section header
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Please enter the following test grades(%) for student #" + (s + 1) + " :");
			System.out.println(" ");
			
			//for each test in the tests variable
			for (int g = 0; g < tests; g++ ) {
				
				//Prompt user for grades for each test + record user input into array
				System.out.print("Test " + (g + 1) + ": ");
				grades[s][g] = input.nextInt();	
			}
		}
	}
	
	//This method gets the grades recorded, and outputs them to user
		//@param n/a
		//@return: void
	public static void showGrades() {
		
		//section header
		System.out.println(" ");
		System.out.println("Class Grades:");
		
		//for each student in the students variable,
		for (int s = 0; s < students; s ++) {
			
			//section header
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Student # " + (s + 1) + " :");
			System.out.println(" ");
			
			//for each test in the tests variable,
			for (int g = 0; g < tests; g++ ) {
				
				//output test grades to user for correspondent grade
				System.out.println("Test " + (g + 1) + ": " + (grades[s][g]) + "%");
			}
		}
	}
	
	//This method calculates the average test score of each user and returns the value
		//@param (int) student number: each specific student 
		//@return(double): sum of all grades of student, divided by number of tests
	public static double studentAvg(int studentNumber) {
		
		//initialize variable to store tests sum
		double avg = 0;
		
		//for each test in the tests variable,
		for (int g = 0; g < tests; g ++) {
			
			//Set sum equal to the current value of sum, plus the test grade at of test g at studentNumber	
			avg = avg + (grades[studentNumber][g]);
		}
		
		//Divide sum of tests by # of tests; return value.
		return (avg/tests);
	}
	
	//This method calculates the average grade of a test among all students.
		//@param (int) test number: each specific test
		//@return(double): sum of all grades of a test, divided by number of students
	public static double testAvg(int testNumber) {
		
		//initialize variable to store tests sum
		double avg = 0;
		
		//for each student in the students variable,
		for (int s = 0; s < students; s ++) {
			
			//Set sum equal to the current value of sum, plus the test grade at index testNumber
			avg = avg + (grades[s][testNumber]);
		}
		
		//Divide sum of tests by # of students; return value.
		return (avg/students);
	}
	
	public static void main(String[] args) {
		
		//format decimal variables
		DecimalFormat shorten = new DecimalFormat("#00.00");
	
		//Greet user
		System.out.println("Welcome to the CourseGrades application!");
		
		//Get grades from user using method
		getGrades();
		
		//Display grades to user using method
		showGrades();
		
		//Section header
		System.out.println(" ");
		System.out.println("Average test grade for each student:");
		System.out.println(" ");
		
		//for each student in the students variable,
		for (int i = 0; i<students; i++) {
			
			//Output student number, and student Avg using method; decimal format result.
			System.out.println("Student " + (i+1) + ": " + shorten.format(studentAvg(i)) + "%");
			
		}
		
		//Section header
		System.out.println(" ");
		System.out.println("Class average for each test:");
		System.out.println(" ");
		
		//for each test in the tests variable,
		for (int i = 0; i<tests; i++) {
			
			//Output test number, and test Avg using method; decimal format result.
			System.out.println("Test " + (i+1) + ": " + shorten.format(testAvg(i)) + "%" );
			
		}
	
	}

}

/* Screen Dump

Test Case 1:

Welcome to the CourseGrades application!
 
 
Please enter the following test grades(%) for student #1 :
 
Test 1: 24
Test 2: 86
Test 3: 99
Test 4: 66
Test 5: 55
 
 
Please enter the following test grades(%) for student #2 :
 
Test 1: 35
Test 2: 87
Test 3: 98
Test 4: 55
Test 5: 34
 
 
Please enter the following test grades(%) for student #3 :
 
Test 1: 76
Test 2: 34
Test 3: 76
Test 4: 87
Test 5: 98
 
 
Please enter the following test grades(%) for student #4 :
 
Test 1: 99
Test 2: 99
Test 3: 99
Test 4: 100
Test 5: 99
 
 
Please enter the following test grades(%) for student #5 :
 
Test 1: 65
Test 2: 34
Test 3: 65
Test 4: 23
Test 5: 12
 
 
Please enter the following test grades(%) for student #6 :
 
Test 1: 65
Test 2: 87
Test 3: 56
Test 4: 88
Test 5: 98
 
 
Please enter the following test grades(%) for student #7 :
 
Test 1: 64
Test 2: 87
Test 3: 75
Test 4: 77
Test 5: 91
 
 
Please enter the following test grades(%) for student #8 :
 
Test 1: 43
Test 2: 12
Test 3: 1
Test 4: 44
Test 5: 5
 
 
Please enter the following test grades(%) for student #9 :
 
Test 1: 12
Test 2: 32
Test 3: 75
Test 4: 45
Test 5: 87
 
 
Please enter the following test grades(%) for student #10 :
 
Test 1: 09
Test 2: 76
Test 3: 56
Test 4: 87
Test 5: 99
 
 
Please enter the following test grades(%) for student #11 :
 
Test 1: 56
Test 2: 45
Test 3: 34
Test 4: 87
Test 5: 56
 
 
Please enter the following test grades(%) for student #12 :
 
Test 1: 98
Test 2: 78
Test 3: 96
Test 4: 57
Test 5: 67
 
Class Grades:
 
 
Student # 1 :
 
Test 1: 24%
Test 2: 86%
Test 3: 99%
Test 4: 66%
Test 5: 55%
 
 
Student # 2 :
 
Test 1: 35%
Test 2: 87%
Test 3: 98%
Test 4: 55%
Test 5: 34%
 
 
Student # 3 :
 
Test 1: 76%
Test 2: 34%
Test 3: 76%
Test 4: 87%
Test 5: 98%
 
 
Student # 4 :
 
Test 1: 99%
Test 2: 99%
Test 3: 99%
Test 4: 100%
Test 5: 99%
 
 
Student # 5 :
 
Test 1: 65%
Test 2: 34%
Test 3: 65%
Test 4: 23%
Test 5: 12%
 
 
Student # 6 :
 
Test 1: 65%
Test 2: 87%
Test 3: 56%
Test 4: 88%
Test 5: 98%
 
 
Student # 7 :
 
Test 1: 64%
Test 2: 87%
Test 3: 75%
Test 4: 77%
Test 5: 91%
 
 
Student # 8 :
 
Test 1: 43%
Test 2: 12%
Test 3: 1%
Test 4: 44%
Test 5: 5%
 
 
Student # 9 :
 
Test 1: 12%
Test 2: 32%
Test 3: 75%
Test 4: 45%
Test 5: 87%
 
 
Student # 10 :
 
Test 1: 9%
Test 2: 76%
Test 3: 56%
Test 4: 87%
Test 5: 99%
 
 
Student # 11 :
 
Test 1: 56%
Test 2: 45%
Test 3: 34%
Test 4: 87%
Test 5: 56%
 
 
Student # 12 :
 
Test 1: 98%
Test 2: 78%
Test 3: 96%
Test 4: 57%
Test 5: 67%
 
Average test grade for each student:
 
Student 1: 66.00%
Student 2: 61.80%
Student 3: 74.20%
Student 4: 99.20%
Student 5: 39.80%
Student 6: 78.80%
Student 7: 78.80%
Student 8: 21.00%
Student 9: 50.20%
Student 10: 65.40%
Student 11: 55.60%
Student 12: 79.20%
 
Class average for each test:
 
Test 1: 53.83%
Test 2: 63.08%
Test 3: 69.17%
Test 4: 68.00%
Test 5: 66.75%


Test Case 2:

Welcome to the CourseGrades application!
 
 
Please enter the following test grades(%) for student #1 :
 
Test 1: 1
Test 2: 1
Test 3: 1
Test 4: 1
Test 5: 1
 
 
Please enter the following test grades(%) for student #2 :
 
Test 1: 2
Test 2: 2
Test 3: 2
Test 4: 2
Test 5: 2
 
 
Please enter the following test grades(%) for student #3 :
 
Test 1: 3
Test 2: 3
Test 3: 3
Test 4: 3
Test 5: 3
 
 
Please enter the following test grades(%) for student #4 :
 
Test 1: 4
Test 2: 4
Test 3: 4
Test 4: 4
Test 5: 4
 
 
Please enter the following test grades(%) for student #5 :
 
Test 1: 5
Test 2: 5
Test 3: 5
Test 4: 5
Test 5: 5
 
 
Please enter the following test grades(%) for student #6 :
 
Test 1: 6
Test 2: 6
Test 3: 6
Test 4: 6
Test 5: 6
 
 
Please enter the following test grades(%) for student #7 :
 
Test 1: 7
Test 2: 7
Test 3: 7
Test 4: 7
Test 5: 7
 
 
Please enter the following test grades(%) for student #8 :
 
Test 1: 8
Test 2: 8
Test 3: 8
Test 4: 8
Test 5: 8
 
 
Please enter the following test grades(%) for student #9 :
 
Test 1: 9
Test 2: 9
Test 3: 9
Test 4: 9
Test 5: 9
 
 
Please enter the following test grades(%) for student #10 :
 
Test 1: 10
Test 2: 10
Test 3: 10
Test 4: 10
Test 5: 10
 
 
Please enter the following test grades(%) for student #11 :
 
Test 1: 11
Test 2: 11
Test 3: 11
Test 4: 11
Test 5: 11
 
 
Please enter the following test grades(%) for student #12 :
 
Test 1: 12
Test 2: 12
Test 3: 12
Test 4: 12
Test 5: 12
 
Class Grades:
 
 
Student # 1 :
 
Test 1: 1%
Test 2: 1%
Test 3: 1%
Test 4: 1%
Test 5: 1%
 
 
Student # 2 :
 
Test 1: 2%
Test 2: 2%
Test 3: 2%
Test 4: 2%
Test 5: 2%
 
 
Student # 3 :
 
Test 1: 3%
Test 2: 3%
Test 3: 3%
Test 4: 3%
Test 5: 3%
 
 
Student # 4 :
 
Test 1: 4%
Test 2: 4%
Test 3: 4%
Test 4: 4%
Test 5: 4%
 
 
Student # 5 :
 
Test 1: 5%
Test 2: 5%
Test 3: 5%
Test 4: 5%
Test 5: 5%
 
 
Student # 6 :
 
Test 1: 6%
Test 2: 6%
Test 3: 6%
Test 4: 6%
Test 5: 6%
 
 
Student # 7 :
 
Test 1: 7%
Test 2: 7%
Test 3: 7%
Test 4: 7%
Test 5: 7%
 
 
Student # 8 :
 
Test 1: 8%
Test 2: 8%
Test 3: 8%
Test 4: 8%
Test 5: 8%
 
 
Student # 9 :
 
Test 1: 9%
Test 2: 9%
Test 3: 9%
Test 4: 9%
Test 5: 9%
 
 
Student # 10 :
 
Test 1: 10%
Test 2: 10%
Test 3: 10%
Test 4: 10%
Test 5: 10%
 
 
Student # 11 :
 
Test 1: 11%
Test 2: 11%
Test 3: 11%
Test 4: 11%
Test 5: 11%
 
 
Student # 12 :
 
Test 1: 12%
Test 2: 12%
Test 3: 12%
Test 4: 12%
Test 5: 12%
 
Average test grade for each student:
 
Student 1: 01.00%
Student 2: 02.00%
Student 3: 03.00%
Student 4: 04.00%
Student 5: 05.00%
Student 6: 06.00%
Student 7: 07.00%
Student 8: 08.00%
Student 9: 09.00%
Student 10: 10.00%
Student 11: 11.00%
Student 12: 12.00%
 
Class average for each test:
 
Test 1: 06.50%
Test 2: 06.50%
Test 3: 06.50%
Test 4: 06.50%
Test 5: 06.50%

 */

