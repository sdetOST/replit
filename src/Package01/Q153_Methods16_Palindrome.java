package Package01;

/*

Complete a method isPalindrome() that will check if number is a palindrome. Print your result as a boolean (true or false). 
Do not convert int into a string!
Example:
input: 1001
output: true

Example:
input: 1234
output: false

 */
import java.util.Scanner;

public class Q153_Methods16_Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		isPalindrome(num);
	}

	public static void isPalindrome(int num) {
		int temp = num;
		int reverse = 0;
		int remainder = 0;

		while (temp != 0) {
			remainder = temp % 10;
			reverse = reverse * 10 + remainder;
			temp = temp / 10;
		}
		System.out.println(num == reverse ? "true" : false);

	}

// -----------Optional : Find Palindrome by converting int into a string------------------
//	
//	public static void isPalindrome(int num) {
//		String str = Integer.toString(num);
//		int l = str.length();
//		String reverse = "";
//		while (l > 0) {
//			l--;
//			reverse += str.charAt(l);
//		}
//		System.out.println(str.equals(reverse) ? "true" : false);
//
//	}

}
