package Package01;

/*
Given a string, if the first or last chars are 'x' or 'X', return the string without those 'x' or 'X' chars,  
otherwise return the string unchanged. 
Example: 
input: xHiX 
output: Hi

Example:
input: apple 
output: apple 
 * 
 */
import java.util.Scanner;

public class Q070_WithoutXx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String word = scan.next();

		String result;
		int l = word.length();
		String sub1 = word.toLowerCase();

		if (sub1.charAt(0) == 'x' && sub1.charAt(l - 1) == 'x')
			result = word.substring(1, l - 1);
		else if (sub1.charAt(0) == 'x' && sub1.charAt(l - 1) != 'x')
			result = word.substring(1);
		else if (sub1.charAt(0) != 'x' && sub1.charAt(l - 1) == 'x')
			result = word.substring(0, l - 1);
		else
			result = word;

		System.out.print(result);
	}

}
