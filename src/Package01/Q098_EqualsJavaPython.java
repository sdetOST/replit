package Package01;
/*
 
Given a string, print out true if the number of appearances of "java" anywhere in the string 
is equal to the number of appearances of "python" anywhere in the string (case sensitive).

Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false 
 
*/

import java.util.Scanner;

public class Q098_EqualsJavaPython {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String sentence = scan.nextLine();

		int s1 = sentence.length();
		int s2 = "java".length();
		int s3 = "python".length();

		int count = 0;
		int a = 0;
		while (count < (s1 - s2 + 1)) {
			if (sentence.substring(count, count + s2).equals("java"))
				++a;
			count++;
		}
		count = 0;
		int b = 0;
		while (count < (s1 - s3 + 1)) {
			if (sentence.substring(count, count + s3).equals("python"))
				++b;
			count++;
		}
		System.out.println(( a == b) ? true: false) ;

	}
}
