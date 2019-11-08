package Package01;
/*
 
A palindrome is a word, number, phrase, or other sequence of characters 
which reads the same backward as forward, such as madam or racecar or 
the number 10801. Write a program that will verify if word is palindrome. 

Example:
input: racecar
output: true 
  
*/
import java.util.Scanner;

public class Q091_Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the html:  ");
		String word = scan.nextLine();
		word = word.toLowerCase().replace(" ", "");
	    int w = word.length();
	    String reverse = "";
	    
	    while (w >  0) {
	    	reverse = reverse + word.charAt(w-1);
	    	w--;
	    }

	    System.out.println((word.equals(reverse))? "true": "false"); 
			
	}
		
}