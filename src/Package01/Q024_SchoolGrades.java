package Package01;

import java.util.Scanner;

public class Q024_SchoolGrades {

	public static void main(String[] args) {
		String subject1,  subject2, subject3,  subject4, summary;
		float grade1,  grade2, grade3,  grade4, average;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Grader!");
		
		System.out.println("Please enter subject name number 1 and score for this subject");
		subject1 = scan.next();
		grade1 = scan.nextFloat();
		
		System.out.println("Please enter subject name number 2 and score for this subject");
		subject2 = scan.next();
		grade2 = scan.nextFloat();
		
		System.out.println("Please enter subject name number 3 and score for this subject");
		subject3 = scan.next();
		grade3 = scan.nextFloat();
		
		System.out.println("Please enter subject name number 4 and score for this subject");
		subject4 = scan.next();
		grade4 = scan.nextFloat();
		
		summary = subject1+" - "+grade1+", "+subject2+" - "+grade2+", "+subject3+" - "+grade3+", "+subject4+" - "+grade4;
		average = (grade1+ grade2+grade3+grade4) / 4;
		
		System.out.println("Summary: "+summary);
		System.out.println("Your average score is: "+average);
		System.out.println("Thank you for using Grader!");
		System.out.println("Goodbye!");
		
	}
}
