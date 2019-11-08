package Package01;
/*

Given a string word, print true if "java" appears starting at index 0 or 1 in the string, 
such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, 
including 0word = . 
Example:
input: javapython
output: true

Example:
input: cjavac++
output: true


Example:
input: c#javaruby
output: false
  
  
 */
import java.util.Scanner;

public class Q089_HasAJava {

	public static void main(String[] args) {
		boolean exists = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string:  ");
		String word = scan.next();
		
		if (word.length() >=4) {
			if (word.substring(0,4).contains("java")) exists = true;
			else if (word.substring(0,5).contains("java")) exists = true;
			else exists = false;
		}
		else
			exists = false;
		
		System.out.println(exists);
	}
}
