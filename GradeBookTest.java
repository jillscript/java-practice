package chapter3;

import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in);
		
		GradeBook myGradeBook = new GradeBook();
		
		System.out.println("Please enter the course name:");
		String theName = input.nextLine();
		
		myGradeBook.setCourseName(theName );
		
		System.out.println("Please enter the course name:");
		System.out.println(); //outputs a blank line
		
		myGradeBook.displayMessage();
	}

}
