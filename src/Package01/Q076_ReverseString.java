package Package01;

import java.util.Scanner;

public class Q076_ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a string");
	    String sentence = scan.nextLine();
	    String result1 = "";
	    String result2 = "";
	    String result3 = "";
	    String result4 = "";
	    String result5 = "";
	    
	    int n1 = sentence.indexOf(" ");
	    int n2 = sentence.indexOf(" ", n1+1);
	    int n3 = sentence.indexOf(" ", n2+1);
	    int n4 = sentence.indexOf(" ", n3+1);
	    
	    result1 = sentence.substring(n4+1);
	    result2 = sentence.substring(n3+1,n4);
	    result3 = sentence.substring(n2+1,n3);
	    result4 = sentence.substring(n1+1,n2);
	    
	    
	    
	    System.out.println(result1+" "+result2+" "+result3+" "+result4);
	}
}
	    
	    
	    
//	    if (sentence.contains(" ")) {
//	    	
//	    	for (int i = l; i > 0; i--) { 
//	    		if (sentence.substring(i-1,i).equals(" ")) {
//	    			System.out.print(sentence.substring(i-1));
//	    			sentence = sentence.substring(0 , i-1);
//	    		}
//	    	}
//	    }else System.out.println(sentence);

