package Package01;
/*
 Given an int variable decimal,  write java program to calculate binary value of the decimal variable and assign it binary array. print out value of binary array matching below format. Feel free to use additional arrays or formulas.

Example:
decimal --> 3
binary --> [0, 0, 0, 0, 0, 0, 1, 1]

decimal --> 35
binary --> [0, 0, 1, 0, 0, 0, 1, 1]

decimal --> 255
binary --> [1, 1, 1, 1, 1, 1, 1, 1] 
 
 */
import java.util.Arrays;
import java.util.Scanner;

public class Q119_Arrays_convertdecimaltobinary {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter a decimal number ;");
	    int decimal = input.nextInt();
	    int[] binary = new int[8]; 
	    

	    
	    String str  = Integer.toBinaryString(decimal);
	    
	    for (int i = str.length(); i < 8; i++) {
	    	str = '0'+str;
	    }
	    char[] chars = str.toCharArray();
	    System.out.println(Arrays.toString(chars));
	    

	    
	    
	}

}
