package Package01;
/*
Print true if the string "cat" and "dog" appear the same number of times 
in the given string word. 
Example:
input: catdog
output: true

Example:
input: catcat
output: false
 * 
 */
import java.util.Scanner;

public class Q088_CatsAndDogs {

	public static void main(String[] args) {
	    Scanner scan= new Scanner(System.in);
	    int countOfCats = 0;
	    int countOfDogs = 0;	    
	    System.out.println("Enter a string: ");	
	    String word = scan.next();
	    
	    int m = word.indexOf("cat");
	    int i = 0;
	    int n = word.indexOf("dog");
	    int j = 0;
	    
	    while ( m != -1) {
	    	countOfCats++;
	    	m = word.indexOf("cat",m+1);
	    }
	    System.out.println(countOfCats);	
	    
	    while ( n != -1) {
	    	countOfDogs++;
	    	n = word.indexOf("dog",n+1);
	    }
	    System.out.println(countOfDogs);
	    
	    System.out.println((i==j)? "true": "false");
 
	  }	

}
