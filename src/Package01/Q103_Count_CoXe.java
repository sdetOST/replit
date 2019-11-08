package Package01;
/*
Print out the number of times that the string "code" appears anywhere in the given string. We'll accept any letter for the 'd', so "cope", "core" and "cooe" count.
Example:
input: aaacodebbb
output: 1

Example:
input: codexxcode
output: 2

Example:
input: cozexxcore
output: 2 
 * 
 */
import java.util.Scanner;

public class Q103_Count_CoXe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scan.nextLine();
		
		int s1 = str.length();
		int count= 0;
	    int b = 0;
	    while (count < (s1-3)){
	    	if (str.substring (count,count+2).equals("co") && str.charAt(count+3)=='e'  ) ++b;
	    	count++;
			      
	    }
	    System.out.println("String \"co?e\" repeted "+b+" times.");
	    
		
	}
}


