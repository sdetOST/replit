package Package01;

import java.util.Scanner;

public class Q059_PrintFirstAndLastLetters {

	public static void main(String[] args) {
		// DO NOT CHANGE
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scan.nextLine();
		String wrd = word.trim();

		char first = wrd.charAt(0);
		char last = wrd.charAt(wrd.length() - 1);

		System.out.println(first + "" + last);

	}
}
