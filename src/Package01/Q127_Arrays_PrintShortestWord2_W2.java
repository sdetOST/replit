package Package01;
/*
Write a program that will find out shortest words in the given string str. 
If there are few words that are evenly short, print them all. Use split method 
in order to split str string variable and create an array of strings.  
Print array with Arrays.toString() method. Sort array before printing. 

input: olive, fish, hot pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]

 */

import java.util.Arrays;
import java.util.Scanner;

public class Q127_Arrays_PrintShortestWord2_W2 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the string: ");
	    String str = scan.nextLine();
		
		str = str.replace(" ","");
	    String[] array = str.split(",");
		    
	    int shorter = array[0].length();
	    for (int i = 0; i < array.length; i++) {
	    	if (array[i].length()<shorter) {
	    		shorter = array[i].length();
	    		}
		}
	    int c = 0;
    	for (int  j= 0; j < array.length; j++) {
    		if (array[j].length()==shorter) c++;
    		
    	}
	    
	    
	    String [] array2 = new String[c];
	    int c1 = 0;
    	for (int  j= 0; j < array.length; j++) {
    		if (array[j].length()==shorter) {
    			array2[c1] = array[j];
    			c1++;
    		}
    	}
    	Arrays.sort(array2);
   	   	System.out.println(Arrays.toString(array2));
		}
}

