package Package01;
/*
 
Return the number of times that the string "java" appears anywhere in the given string word.

Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
 * 
 */
import java.util.Scanner;
public class Q087_CountJava {

	public static void main(String[] args) {
	    Scanner scan= new Scanner(System.in);
	    
	    System.out.println("Enter a string: ");	
	    String word = scan.next();
	    
	    int m = word.indexOf("java");
	    int i = 0;
	    while ( m != -1) {
	    	i++;
	    	m = word.indexOf("java",m+1);
	    }
	    System.out.println(i);	
 
	  }	

}
