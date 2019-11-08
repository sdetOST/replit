package Package01;
/*
 
Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence --> "Java is fun"
Print
Java
is
fun
 
*/

import java.util.Scanner;

public class Q116_Arrays_SplitSentence {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sentences: ");
		String sentence = input.nextLine();

		String[] word = sentence.split(" ");

		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
		
System.out.println("Reverse------------------------------");

		
		for (int i = word.length-1; i >=0; i--) {
			System.out.println(word[i]);
		}
		
System.out.println("Reverse ---> Assign to a string------------------------------");
 
		String rev = "";
		for (int i=word.length-1; i >=0; i--) {
			rev = rev + word[i]+ " ";
		}
		System.out.println(rev);
		

	}
}
