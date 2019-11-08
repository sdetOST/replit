package Package01;
/*
We'll say that a "triple" in a string is a char appearing three times in a row. 
Print out the number of triples in the given string. The triples may overlap.

Example:
input: abcXXXabc
output: 1

Example:
input: xxxabyyyycd
output: 3

Example:
input: java
output: 0
 * 
 */

import java.util.Scanner;

public class Q099_CountTriples {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scan.nextLine();
		int count = 0;

		for (int i = 0; i < str.length()-2; i++) {

			if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2))
				count++;
		}
		System.out.println(count);
	}
}
