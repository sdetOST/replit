package Package01;
/*
Given a string and an int n, return a string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive.
Example:
input: Hello
input: 3
output: llollollo

Example:
input: Hello
input: 2
output: lolo
 * 
 */

import java.util.Scanner;

public class Q101_RepeatEnd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a string: ");
		String str = scan.next();
		System.out.println("please enter an integer: ");
		int n = scan.nextInt();
		
		int sl = str.length();
		
		String s = str.substring(sl-n);
		String result = "";
		for (int i=0; i<n; i++) result = result+s;
		
		System.out.println( result );
	}
}

