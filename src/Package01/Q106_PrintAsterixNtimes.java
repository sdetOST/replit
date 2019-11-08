package Package01;
/*
 
Given an int variable n that has already been declared and initialized to 
a positive value, and another int variable j that has already been declared, 
use a for loop to print a single line consisting of n asterisks. 
Thus if n contains 5, five asterisks will be printed. 
Use no variables other than n and j.    

Example:
input: 1
output: *

Example:
input: 3
output: ***
 * 
 */
import java.util.Scanner;

public class Q106_PrintAsterixNtimes {

	public static void main(String[] args) {
		int j = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an iteger: ");
		int n = scan.nextInt();
		String s = "";
		if (n % 5 == 0 && n % 10 != 0)
			s = "*****";

		else {
			for (j = 1; j <= n; j++)
				s = s + "*";
		}

		System.out.println(s);

	}
}
