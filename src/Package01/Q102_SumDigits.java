package Package01;
/*
Given a string str, print out the sum of the digits 0-9 that appear in the string, 
ignoring all other characters. Print out 0 if there are no digits in the string. 
(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. 
Integer.parseInt(string) converts a string to an int.)

Example of conversion:
String word = "1java";
boolean isNumber = Character.isDigit(word.charAt(0)); <-- in this way, we can check if character is digit.
int num = Integer.parseInt(word.substring(0,1)); <-- in this way, we can convert String to int

Example:
input: aa1bc2d3
output: 6

Example:
input: aa11b33
output: 8

Example:
input: Chocolate
output: 0
 * 
 */

import java.util.Scanner;

public class Q102_SumDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a string: ");
		String str = scan.next();

		int sl = str.length();
		String snum = "";
//		String snums = "";																//addition
		int sum = 0;
		for (int i = 0; i < sl; i++) {

			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) { // same---> if (Character.isDigit(str.charAt(i)))
				snum = str.charAt(i)+"";
				int num = Integer.parseInt(snum);
				sum = sum + num;
//				snums = snums + str.charAt(i);												//addition	
				
			}
		}
//		System.out.println("The numbers in the string are: \""+ snums + "\" ");				//addition	
		System.out.println("The sum is: "+sum);
		
	}
}