package Package01;
/*
Write a program that will print the shortest word in the given array str. 

input: java, cable, red, vivid, remedy, grace
output: red

 */

import java.util.Scanner;

public class Q126_Arrays_PrintShortestWord {

	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enterb the 6 strings for Array str :");
		    String[] str = {scan.next(), scan.next(), scan.next(), 
		                    scan.next(), scan.next(), scan.next()};
		    
		    int shorter = str[0].length();
		    int c = 0;
		    for (int i = 0; i < str.length; i++) {
		    	if (str[i].length()<shorter) {
		    		shorter = str[i].length();
		    		c = i;
		    	}
			}
			System.out.println(str[c]);
	  }
}


