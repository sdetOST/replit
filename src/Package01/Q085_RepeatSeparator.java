package Package01;
/*

Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
Example:
input: Word
input: X
input: 3
output: WordXWordXWord

Example:
input: This
input: And
input: 2
output: ThisAndThis

Example:
input: This
input: And
input: 1
output: This
 
 */
import java.util.Scanner;

public class Q085_RepeatSeparator {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
	    String word = scan.next();
	    System.out.println("Enter a separator: ");
		String separator = scan.next();
		System.out.println("Enter a number: ");
	    int count = scan.nextInt();
	    int w1 = word.length();
	    int s = separator.length();
		     
	    String result = separator.concat(word);
	    
	    int i = 1;
	    while ( i++ < count){
	      word  = word + result  ;

	    }
	    System.out.println(word);
		    
	}
}
