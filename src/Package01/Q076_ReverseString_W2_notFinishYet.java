package Package01;

import java.util.Scanner;

public class Q076_ReverseString_W2_notFinishYet {

	public static void main(String[] args) {	
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a string");
	    String sentence = scan.nextLine();
	    String result = "";
	    int l = sentence.length();
	    
	    if (sentence.contains(" ")) {
	    	
	    	for (int i = l; i > 0; i--) { 
	    		if (sentence.substring(i-1,i).equals(" ")) {
	    			System.out.print(sentence.substring(i-1));
	    			sentence = sentence.substring(0 , i-1);
	    		}
	    	}
	    }else System.out.println(sentence);
	    		 

//	     for (int i = 1; i < l-1; i++) {
//	    	 if (sentence.substring(i-1,i).equals(" ")) {
//	    		 System.out.print(sentence.substring(0,i));
//	    		 sentence = sentence.substring(i);
//	    	 } 
//	     }
//	     System.out.println(sentence);
	}
}
