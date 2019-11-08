package Package01;

import java.util.Scanner;

public class Q060_VerifyContains {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scan.nextLine();
		System.out.println("Enter a sentence");
		String sentence = scan.nextLine();

		System.out.println(sentence.contains(word));


	}

}
