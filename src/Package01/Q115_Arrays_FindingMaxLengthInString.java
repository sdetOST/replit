package Package01;
/*

Given the array words, it will print the word with the largest length. 
Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa

 
*/

import java.util.Arrays;
import java.util.Scanner;

public class Q115_Arrays_FindingMaxLengthInString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter string " + (i + 1) + ": ");
			words[i] = input.nextLine();
		}
		
		int max = words[0].length();
		int k = 0;
		for (int i = 1; i < words.length; i++) {

			if (words[i].length() > max) {
				max = words[i].length();
				k = i;
			}
		}
		System.out.println("The longest string is : "+words[k]);
		System.out.println("The length is: "+max);
	}
}
